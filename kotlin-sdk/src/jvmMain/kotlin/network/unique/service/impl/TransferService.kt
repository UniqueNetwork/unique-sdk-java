package network.unique.service.impl

import network.unique.api.BalanceApi
import network.unique.model.*
import network.unique.service.MutationService
import network.unique.signer.CryptoScheme
import network.unique.signer.Pair

class TransferService(basePath: String) : MutationService<MutationBody>() {

    private val api: BalanceApi = BalanceApi(basePath)

    override fun build(args: MutationBody): UnsignedTxPayloadResponse {
        val res = api.transferMutation(args, BalanceApi.Use_transferMutation.build)
        return UnsignedTxPayloadResponse(res.signerPayloadJSON, res.signerPayloadRaw, res.signerPayloadHex, res.fee)
    }

    override fun getFee(args: MutationBody): FeeResponse {
        val res = api.transferMutation(args, BalanceApi.Use_transferMutation.build, true)
        return res.fee!!
    }

    override fun getFee(args: UnsignedTxPayloadResponse): FeeResponse {
        val res = api.transferMutation(
            MutationBody(
                signerPayloadHex = args.signerPayloadHex,
                signerPayloadRaw = args.signerPayloadRaw,
                signerPayloadJSON = args.signerPayloadJSON,
                fee = args.fee
            ), BalanceApi.Use_transferMutation.build, true
        )
        return res.fee!!
    }

    override fun getFee(args: SubmitTxBody): FeeResponse {
        val res = api.transferMutation(
            MutationBody(
                signature = args.signature,
                signerPayloadJSON = args.signerPayloadJSON,
            ), BalanceApi.Use_transferMutation.build, true
        )
        return res.fee!!
    }

    override fun sign(args: MutationBody, seed: String): SubmitTxBody {
        val signPayload = build(args)
        return sign(signPayload, seed)
    }

    override fun sign(args: UnsignedTxPayloadResponse, seed: String): SubmitTxBody {
        val keyPair = Pair.fromSuri(CryptoScheme.Sr25519, seed, null)

        val signature = keyPair.sign(toByteArray(args.signerPayloadRaw.data.substring(2)))
            .joinToString("") { eachByte -> "%02x".format(eachByte) }

        return SubmitTxBody(args.signerPayloadJSON, signature)
    }

    override fun submit(args: MutationBody, seed: String): SubmitResultResponse {
        val signedBody = sign(args, seed)
        return submit(signedBody)
    }

    override fun submit(args: UnsignedTxPayloadResponse, seed: String): SubmitResultResponse {
        val signedBody = sign(args, seed)
        return submit(signedBody)
    }

    override fun submit(args: SubmitTxBody): SubmitResultResponse {
        val response = api.transferMutation(
            MutationBody(
                signerPayloadJSON = args.signerPayloadJSON,
                signature = args.signature
            ), BalanceApi.Use_transferMutation.submit
        )
        return SubmitResultResponse(response.hash)
    }

    override fun submitWatch(args: MutationBody, seed: String): SubmitResultResponse {
        val signedBody = sign(args, seed)
        return submitWatch(signedBody)
    }

    override fun submitWatch(args: UnsignedTxPayloadResponse, seed: String): SubmitResultResponse {
        val signedBody = sign(args, seed)
        return submitWatch(signedBody)
    }

    override fun submitWatch(args: SubmitTxBody): SubmitResultResponse {
        val response = api.transferMutation(
            MutationBody(
                signerPayloadJSON = args.signerPayloadJSON,
                signature = args.signature
            ), BalanceApi.Use_transferMutation.submitWatch
        )
        return SubmitResultResponse(response.hash)
    }
}
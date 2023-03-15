/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package network.unique.model

import network.unique.model.BuildBatchPayloadsResponse
import network.unique.model.FeeBodyResponse
import network.unique.model.FeeResponse
import network.unique.model.SignResponse
import network.unique.model.SignerPayloadJSONDto
import network.unique.model.SignerPayloadRawDto
import network.unique.model.SubmitResponse
import network.unique.model.TransferRefungibleTokenParsed
import network.unique.model.TransferRefungibleTokenResponse
import network.unique.model.UnsignedTxPayloadResponse

import com.squareup.moshi.Json

/**
 * 
 *
 * @param signerPayloadJSON 
 * @param signerPayloadRaw 
 * @param signerPayloadHex 
 * @param fee 
 * @param signature Warning: Signature must be with SignatureType!
 * @param hash 
 * @param isError 
 * @param parsed 
 * @param payloads 
 * @param nextNonce 
 */


data class TransferTokensMutationDefaultResponse1 (

    @Json(name = "signerPayloadJSON")
    val signerPayloadJSON: SignerPayloadJSONDto? = null,

    @Json(name = "signerPayloadRaw")
    val signerPayloadRaw: SignerPayloadRawDto? = null,

    @Json(name = "signerPayloadHex")
    val signerPayloadHex: kotlin.String? = null,

    @Json(name = "fee")
    val fee: FeeResponse? = null,

    /* Warning: Signature must be with SignatureType! */
    @Json(name = "signature")
    val signature: kotlin.String? = null,

    @Json(name = "hash")
    val hash: kotlin.String? = null,

    @Json(name = "isError")
    val isError: kotlin.Boolean? = null,

    @Json(name = "parsed")
    val parsed: TransferRefungibleTokenParsed? = null,

    @Json(name = "payloads")
    val payloads: kotlin.collections.List<UnsignedTxPayloadResponse>? = null,

    @Json(name = "nextNonce")
    val nextNonce: java.math.BigDecimal

)


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

import network.unique.model.ApproveFungibleTokensArgs
import network.unique.model.SignerPayloadJSONDto
import network.unique.model.SignerPayloadRawDto
import network.unique.model.SubmitTxBody
import network.unique.model.UnsignedTxPayloadBody

import com.squareup.moshi.Json

/**
 * 
 *
 * @param address The ss-58 encoded address
 * @param spender The ss-58 encoded address
 * @param collectionId 
 * @param amount 
 * @param signerPayloadJSON 
 * @param signerPayloadRaw 
 * @param signerPayloadHex 
 * @param signature Warning: Signature must be with SignatureType!
 */


data class ApproveTokensMutationRequest (

    /* The ss-58 encoded address */
    @Json(name = "address")
    val address: kotlin.String,

    /* The ss-58 encoded address */
    @Json(name = "spender")
    val spender: kotlin.String,

    @Json(name = "collectionId")
    val collectionId: java.math.BigDecimal,

    @Json(name = "amount")
    val amount: java.math.BigDecimal,

    @Json(name = "signerPayloadJSON")
    val signerPayloadJSON: SignerPayloadJSONDto,

    @Json(name = "signerPayloadRaw")
    val signerPayloadRaw: SignerPayloadRawDto,

    @Json(name = "signerPayloadHex")
    val signerPayloadHex: kotlin.String,

    /* Warning: Signature must be with SignatureType! */
    @Json(name = "signature")
    val signature: kotlin.String

)


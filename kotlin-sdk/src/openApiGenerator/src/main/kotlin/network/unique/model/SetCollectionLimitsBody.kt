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

import network.unique.model.EffectiveCollectionLimitsResponseLimits

import com.squareup.moshi.Json

/**
 * 
 *
 * @param limits 
 * @param address The ss-58 encoded address
 * @param collectionId 
 */


data class SetCollectionLimitsBody (

    @Json(name = "limits")
    val limits: EffectiveCollectionLimitsResponseLimits? = null,

    /* The ss-58 encoded address */
    @Json(name = "address")
    val address: kotlin.String? = null,

    @Json(name = "collectionId")
    val collectionId: java.math.BigDecimal? = null,

    @Json(name = "signerPayloadJSON")
    val signerPayloadJSON: SignerPayloadJSONDto? = null,

    /* Warning: Signature must be with SignatureType! */
    @Json(name = "signature")
    val signature: kotlin.String? = null,

    @Json(name = "signerPayloadRaw")
    val signerPayloadRaw: SignerPayloadRawDto? = null,

    @Json(name = "signerPayloadHex")
    val signerPayloadHex: kotlin.String? = null,

    @Json(name = "fee")
    val fee: FeeResponse? = null

)


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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param section 
 * @param method 
 * @param events 
 * @param args 
 * @param nonce 
 * @param signer 
 */


data class GetExtrinsicResponse (

    @Json(name = "section")
    val section: kotlin.String? = null,

    @Json(name = "method")
    val method: kotlin.String? = null,

    @Json(name = "events")
    val events: kotlin.collections.List<kotlin.Any>? = null,

    @Json(name = "args")
    val args: kotlin.collections.List<kotlin.Any>? = null,

    @Json(name = "nonce")
    val nonce: java.math.BigDecimal? = null,

    @Json(name = "signer")
    val signer: kotlin.String? = null,

)


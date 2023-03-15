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

import network.unique.model.NestedToken
import network.unique.model.TokenId
import network.unique.model.TokenProperty

import com.squareup.moshi.Json

/**
 * 
 *
 * @param tokenId 
 * @param collectionId 
 * @param owner The ss-58 encoded address
 * @param attributes 
 * @param image 
 * @param nestingChildTokens 
 * @param properties 
 * @param nestingParentToken 
 */


data class GetBundleResponse (

    @Json(name = "tokenId")
    val tokenId: java.math.BigDecimal? = null,

    @Json(name = "collectionId")
    val collectionId: java.math.BigDecimal? = null,

    /* The ss-58 encoded address */
    @Json(name = "owner")
    val owner: kotlin.String? = null,

    @Json(name = "attributes")
    val attributes: kotlin.Any? = null,

    @Json(name = "image")
    val image: kotlin.Any? = null,

    @Json(name = "nestingChildTokens")
    val nestingChildTokens: kotlin.collections.List<NestedToken>? = null,

    @Json(name = "properties")
    val properties: kotlin.collections.List<TokenProperty>? = null,

    @Json(name = "nestingParentToken")
    val nestingParentToken: TokenId? = null

)


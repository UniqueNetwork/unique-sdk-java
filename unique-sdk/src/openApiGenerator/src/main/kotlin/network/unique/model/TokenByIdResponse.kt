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

import network.unique.model.CollectionInfoWithSchemaResponse
import network.unique.model.DecodedAttributeDto
import network.unique.model.DecodedAttributeDtoName
import network.unique.model.NestingParentId
import network.unique.model.TokenProperty
import network.unique.model.UniqueCollectionSchemaDecodedDtoCoverPicture

import com.squareup.moshi.Json

/**
 * 
 *
 * @param attributes 
 * @param collectionId 
 * @param image 
 * @param owner The ss-58 encoded address
 * @param tokenId 
 * @param nestingParentToken 
 * @param properties 
 * @param collection 
 * @param audio 
 * @param description 
 * @param name 
 * @param imagePreview 
 * @param spatialObject 
 * @param video 
 */


data class TokenByIdResponse (

    @Json(name = "attributes")
    val attributes: kotlin.collections.List<DecodedAttributeDto>? = null,

    @Json(name = "collectionId")
    val collectionId: java.math.BigDecimal? = null,

    @Json(name = "image")
    val image: UniqueCollectionSchemaDecodedDtoCoverPicture? = null,

    /* The ss-58 encoded address */
    @Json(name = "owner")
    val owner: kotlin.String? = null,

    @Json(name = "tokenId")
    val tokenId: java.math.BigDecimal? = null,

    @Json(name = "nestingParentToken")
    val nestingParentToken: NestingParentId? = null,

    @Json(name = "properties")
    val properties: kotlin.collections.List<TokenProperty>? = null,

    @Json(name = "collection")
    val collection: CollectionInfoWithSchemaResponse? = null,

    @Json(name = "audio")
    val audio: UniqueCollectionSchemaDecodedDtoCoverPicture? = null,

    @Json(name = "description")
    val description: DecodedAttributeDtoName? = null,

    @Json(name = "name")
    val name: DecodedAttributeDtoName? = null,

    @Json(name = "imagePreview")
    val imagePreview: UniqueCollectionSchemaDecodedDtoCoverPicture? = null,

    @Json(name = "spatialObject")
    val spatialObject: UniqueCollectionSchemaDecodedDtoCoverPicture? = null,

    @Json(name = "video")
    val video: UniqueCollectionSchemaDecodedDtoCoverPicture? = null

)


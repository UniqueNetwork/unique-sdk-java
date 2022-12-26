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

package network.unique.api

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import network.unique.model.AllBalancesResponse
import network.unique.model.TransferMutationDefaultResponse
import network.unique.model.TransferMutationRequest

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class BalanceApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * 
     * 
     * @param address 
     * @return AllBalancesResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun balanceControllerGetBalance(address: kotlin.String) : AllBalancesResponse {
        val localVarResponse = balanceControllerGetBalanceWithHttpInfo(address = address)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AllBalancesResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param address 
     * @return ApiResponse<AllBalancesResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun balanceControllerGetBalanceWithHttpInfo(address: kotlin.String) : ApiResponse<AllBalancesResponse?> {
        val localVariableConfig = balanceControllerGetBalanceRequestConfig(address = address)

        return request<Unit, AllBalancesResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation balanceControllerGetBalance
     *
     * @param address 
     * @return RequestConfig
     */
    fun balanceControllerGetBalanceRequestConfig(address: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("address", listOf(address.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/v1/balance",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter use
     */
     enum class Use_transferMutation(val value: kotlin.String) {
         @Json(name = "Build") build("Build"),
         @Json(name = "BuildBatch") buildBatch("BuildBatch"),
         @Json(name = "Sign") sign("Sign"),
         @Json(name = "Submit") submit("Submit"),
         @Json(name = "Result") result("Result"),
         @Json(name = "GetFee") getFee("GetFee")
     }

    /**
     * 
     * 
     * @param transferMutationRequest 
     * @param use  (optional)
     * @param withFee  (optional, default to false)
     * @param verify  (optional, default to false)
     * @param callbackUrl  (optional)
     * @param nonce  (optional)
     * @return TransferMutationDefaultResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun transferMutation(transferMutationRequest: TransferMutationRequest, use: Use_transferMutation? = null, withFee: kotlin.Boolean? = false, verify: kotlin.Boolean? = false, callbackUrl: kotlin.String? = null, nonce: java.math.BigDecimal? = null) : TransferMutationDefaultResponse {
        val localVarResponse = transferMutationWithHttpInfo(transferMutationRequest = transferMutationRequest, use = use, withFee = withFee, verify = verify, callbackUrl = callbackUrl, nonce = nonce)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TransferMutationDefaultResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param transferMutationRequest 
     * @param use  (optional)
     * @param withFee  (optional, default to false)
     * @param verify  (optional, default to false)
     * @param callbackUrl  (optional)
     * @param nonce  (optional)
     * @return ApiResponse<TransferMutationDefaultResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun transferMutationWithHttpInfo(transferMutationRequest: TransferMutationRequest, use: Use_transferMutation?, withFee: kotlin.Boolean?, verify: kotlin.Boolean?, callbackUrl: kotlin.String?, nonce: java.math.BigDecimal?) : ApiResponse<TransferMutationDefaultResponse?> {
        val localVariableConfig = transferMutationRequestConfig(transferMutationRequest = transferMutationRequest, use = use, withFee = withFee, verify = verify, callbackUrl = callbackUrl, nonce = nonce)

        return request<TransferMutationRequest, TransferMutationDefaultResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation transferMutation
     *
     * @param transferMutationRequest 
     * @param use  (optional)
     * @param withFee  (optional, default to false)
     * @param verify  (optional, default to false)
     * @param callbackUrl  (optional)
     * @param nonce  (optional)
     * @return RequestConfig
     */
    fun transferMutationRequestConfig(transferMutationRequest: TransferMutationRequest, use: Use_transferMutation?, withFee: kotlin.Boolean?, verify: kotlin.Boolean?, callbackUrl: kotlin.String?, nonce: java.math.BigDecimal?) : RequestConfig<TransferMutationRequest> {
        val localVariableBody = transferMutationRequest
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (use != null) {
                    put("use", listOf(use.toString()))
                }
                if (withFee != null) {
                    put("withFee", listOf(withFee.toString()))
                }
                if (verify != null) {
                    put("verify", listOf(verify.toString()))
                }
                if (callbackUrl != null) {
                    put("callbackUrl", listOf(callbackUrl.toString()))
                }
                if (nonce != null) {
                    put("nonce", listOf(nonce.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v1/balance/transfer",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}

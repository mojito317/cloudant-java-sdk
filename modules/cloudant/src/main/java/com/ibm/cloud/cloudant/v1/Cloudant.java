/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

/*
 * IBM OpenAPI SDK Code Generator Version: 3.12.0-64fe8d3f-20200820-144050
 */

package com.ibm.cloud.cloudant.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.cloudant.v1.model.ActiveTask;
import com.ibm.cloud.cloudant.v1.model.AllDocsQueriesResult;
import com.ibm.cloud.cloudant.v1.model.AllDocsResult;
import com.ibm.cloud.cloudant.v1.model.ApiKeysResult;
import com.ibm.cloud.cloudant.v1.model.BulkGetResult;
import com.ibm.cloud.cloudant.v1.model.ChangesResult;
import com.ibm.cloud.cloudant.v1.model.CorsConfiguration;
import com.ibm.cloud.cloudant.v1.model.DatabaseInformation;
import com.ibm.cloud.cloudant.v1.model.DbUpdates;
import com.ibm.cloud.cloudant.v1.model.DbsInfoResult;
import com.ibm.cloud.cloudant.v1.model.DeleteAttachmentOptions;
import com.ibm.cloud.cloudant.v1.model.DeleteDatabaseOptions;
import com.ibm.cloud.cloudant.v1.model.DeleteDesignDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.DeleteDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.DeleteIamSessionOptions;
import com.ibm.cloud.cloudant.v1.model.DeleteIndexOptions;
import com.ibm.cloud.cloudant.v1.model.DeleteLocalDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.DeleteReplicationDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.DesignDocument;
import com.ibm.cloud.cloudant.v1.model.DesignDocumentInformation;
import com.ibm.cloud.cloudant.v1.model.Document;
import com.ibm.cloud.cloudant.v1.model.DocumentResult;
import com.ibm.cloud.cloudant.v1.model.DocumentShardInfo;
import com.ibm.cloud.cloudant.v1.model.EnsureFullCommitInformation;
import com.ibm.cloud.cloudant.v1.model.ExplainResult;
import com.ibm.cloud.cloudant.v1.model.FindResult;
import com.ibm.cloud.cloudant.v1.model.GeoIndexInformation;
import com.ibm.cloud.cloudant.v1.model.GeoResult;
import com.ibm.cloud.cloudant.v1.model.GetActiveTasksOptions;
import com.ibm.cloud.cloudant.v1.model.GetAllDbsOptions;
import com.ibm.cloud.cloudant.v1.model.GetAttachmentOptions;
import com.ibm.cloud.cloudant.v1.model.GetCorsInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetDatabaseInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetDbUpdatesOptions;
import com.ibm.cloud.cloudant.v1.model.GetDesignDocumentInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetDesignDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.GetDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.GetDocumentShardsInfoOptions;
import com.ibm.cloud.cloudant.v1.model.GetGeoIndexInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetGeoOptions;
import com.ibm.cloud.cloudant.v1.model.GetIamSessionInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetIndexesInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetLocalDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.GetMembershipInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetPartitionInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetReplicationDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.GetSchedulerDocsOptions;
import com.ibm.cloud.cloudant.v1.model.GetSchedulerDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.GetSchedulerJobOptions;
import com.ibm.cloud.cloudant.v1.model.GetSchedulerJobsOptions;
import com.ibm.cloud.cloudant.v1.model.GetSearchInfoOptions;
import com.ibm.cloud.cloudant.v1.model.GetSecurityOptions;
import com.ibm.cloud.cloudant.v1.model.GetServerInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetSessionInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetShardsInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetUpInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetUuidsOptions;
import com.ibm.cloud.cloudant.v1.model.HeadAttachmentOptions;
import com.ibm.cloud.cloudant.v1.model.HeadDatabaseOptions;
import com.ibm.cloud.cloudant.v1.model.HeadDesignDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.HeadDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.HeadReplicationDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.HeadSchedulerJobOptions;
import com.ibm.cloud.cloudant.v1.model.IamSessionInformation;
import com.ibm.cloud.cloudant.v1.model.IndexResult;
import com.ibm.cloud.cloudant.v1.model.IndexesInformation;
import com.ibm.cloud.cloudant.v1.model.MembershipInformation;
import com.ibm.cloud.cloudant.v1.model.MissingRevsResult;
import com.ibm.cloud.cloudant.v1.model.Ok;
import com.ibm.cloud.cloudant.v1.model.PartitionInformation;
import com.ibm.cloud.cloudant.v1.model.PostAllDocsOptions;
import com.ibm.cloud.cloudant.v1.model.PostAllDocsQueriesOptions;
import com.ibm.cloud.cloudant.v1.model.PostApiKeysOptions;
import com.ibm.cloud.cloudant.v1.model.PostBulkDocsOptions;
import com.ibm.cloud.cloudant.v1.model.PostBulkGetOptions;
import com.ibm.cloud.cloudant.v1.model.PostChangesOptions;
import com.ibm.cloud.cloudant.v1.model.PostDbsInfoOptions;
import com.ibm.cloud.cloudant.v1.model.PostDesignDocsOptions;
import com.ibm.cloud.cloudant.v1.model.PostDesignDocsQueriesOptions;
import com.ibm.cloud.cloudant.v1.model.PostDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.PostEnsureFullCommitOptions;
import com.ibm.cloud.cloudant.v1.model.PostExplainOptions;
import com.ibm.cloud.cloudant.v1.model.PostFindOptions;
import com.ibm.cloud.cloudant.v1.model.PostGeoCleanupOptions;
import com.ibm.cloud.cloudant.v1.model.PostIamSessionOptions;
import com.ibm.cloud.cloudant.v1.model.PostIndexOptions;
import com.ibm.cloud.cloudant.v1.model.PostLocalDocsOptions;
import com.ibm.cloud.cloudant.v1.model.PostLocalDocsQueriesOptions;
import com.ibm.cloud.cloudant.v1.model.PostMissingRevsOptions;
import com.ibm.cloud.cloudant.v1.model.PostPartitionAllDocsOptions;
import com.ibm.cloud.cloudant.v1.model.PostPartitionFindOptions;
import com.ibm.cloud.cloudant.v1.model.PostPartitionSearchOptions;
import com.ibm.cloud.cloudant.v1.model.PostPartitionViewOptions;
import com.ibm.cloud.cloudant.v1.model.PostReplicateOptions;
import com.ibm.cloud.cloudant.v1.model.PostRevsDiffOptions;
import com.ibm.cloud.cloudant.v1.model.PostSearchAnalyzeOptions;
import com.ibm.cloud.cloudant.v1.model.PostSearchOptions;
import com.ibm.cloud.cloudant.v1.model.PostViewOptions;
import com.ibm.cloud.cloudant.v1.model.PostViewQueriesOptions;
import com.ibm.cloud.cloudant.v1.model.PutAttachmentOptions;
import com.ibm.cloud.cloudant.v1.model.PutCloudantSecurityConfigurationOptions;
import com.ibm.cloud.cloudant.v1.model.PutCorsConfigurationOptions;
import com.ibm.cloud.cloudant.v1.model.PutDatabaseOptions;
import com.ibm.cloud.cloudant.v1.model.PutDesignDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.PutDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.PutLocalDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.PutReplicationDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.PutSecurityOptions;
import com.ibm.cloud.cloudant.v1.model.ReplicationDocument;
import com.ibm.cloud.cloudant.v1.model.ReplicationResult;
import com.ibm.cloud.cloudant.v1.model.RevsDiff;
import com.ibm.cloud.cloudant.v1.model.SchedulerDocsResult;
import com.ibm.cloud.cloudant.v1.model.SchedulerDocument;
import com.ibm.cloud.cloudant.v1.model.SchedulerJob;
import com.ibm.cloud.cloudant.v1.model.SchedulerJobsResult;
import com.ibm.cloud.cloudant.v1.model.SearchAnalyzeResult;
import com.ibm.cloud.cloudant.v1.model.SearchInfoResult;
import com.ibm.cloud.cloudant.v1.model.SearchResult;
import com.ibm.cloud.cloudant.v1.model.Security;
import com.ibm.cloud.cloudant.v1.model.ServerInformation;
import com.ibm.cloud.cloudant.v1.model.SessionInformation;
import com.ibm.cloud.cloudant.v1.model.ShardsInformation;
import com.ibm.cloud.cloudant.v1.model.UpInformation;
import com.ibm.cloud.cloudant.v1.model.UuidsResult;
import com.ibm.cloud.cloudant.v1.model.ViewQueriesResult;
import com.ibm.cloud.cloudant.v1.model.ViewResult;
import com.ibm.cloud.cloudant.common.SdkCommon;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;


import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * NoSQL database based on Apache CouchDB.
 *
 * @version v1
 * @see <a href="https://cloud.ibm.com/docs/services/Cloudant/">Cloudant</a>
 */
public class Cloudant extends com.ibm.cloud.cloudant.internal.CloudantBaseService {

  public static final String DEFAULT_SERVICE_NAME = "cloudant";

  public static final String DEFAULT_SERVICE_URL = "http://localhost:5984";

 /**
   * Class method which constructs an instance of the `Cloudant` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `Cloudant` client using external configuration
   */
  public static Cloudant newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Cloudant` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Cloudant` client using external configuration
   */
  public static Cloudant newInstance(String serviceName) {
    Authenticator authenticator = com.ibm.cloud.cloudant.internal.DelegatingAuthenticatorFactory.getAuthenticator(serviceName);
    Cloudant service = new Cloudant(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Cloudant` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Cloudant(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * Retrieve server instance information.
   *
   * When you access the root of an instance, IBM Cloudant returns meta-information about the instance. The response
   * includes a JSON structure that contains information about the server, including a welcome message and the server's
   * version.
   *
   * @param getServerInformationOptions the {@link GetServerInformationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ServerInformation}
   */
  public ServiceCall<ServerInformation> getServerInformation(GetServerInformationOptions getServerInformationOptions) {
    String[] pathSegments = { "" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getServerInformation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ServerInformation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ServerInformation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve server instance information.
   *
   * When you access the root of an instance, IBM Cloudant returns meta-information about the instance. The response
   * includes a JSON structure that contains information about the server, including a welcome message and the server's
   * version.
   *
   * @return a {@link ServiceCall} with a result of type {@link ServerInformation}
   */
  public ServiceCall<ServerInformation> getServerInformation() {
    return getServerInformation(null);
  }

  /**
   * Retrieve cluster membership information.
   *
   * Displays the nodes that are part of the cluster as `cluster_nodes`. The field, `all_nodes`, displays all nodes this
   * node knows about, including the ones that are part of the cluster. This endpoint is useful when you set up a
   * cluster.
   *
   * @param getMembershipInformationOptions the {@link GetMembershipInformationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MembershipInformation}
   */
  public ServiceCall<MembershipInformation> getMembershipInformation(GetMembershipInformationOptions getMembershipInformationOptions) {
    String[] pathSegments = { "_membership" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getMembershipInformation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<MembershipInformation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MembershipInformation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve cluster membership information.
   *
   * Displays the nodes that are part of the cluster as `cluster_nodes`. The field, `all_nodes`, displays all nodes this
   * node knows about, including the ones that are part of the cluster. This endpoint is useful when you set up a
   * cluster.
   *
   * @return a {@link ServiceCall} with a result of type {@link MembershipInformation}
   */
  public ServiceCall<MembershipInformation> getMembershipInformation() {
    return getMembershipInformation(null);
  }

  /**
   * Retrieve one or more UUIDs.
   *
   * Requests one or more Universally Unique Identifiers (UUIDs) from the instance. The response is a JSON object that
   * provides a list of UUIDs.
   *
   * @param getUuidsOptions the {@link GetUuidsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link UuidsResult}
   */
  public ServiceCall<UuidsResult> getUuids(GetUuidsOptions getUuidsOptions) {
    if (getUuidsOptions == null) {
      getUuidsOptions = new GetUuidsOptions.Builder().build();
    }
    String[] pathSegments = { "_uuids" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getUuids");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getUuidsOptions.count() != null) {
      builder.query("count", String.valueOf(getUuidsOptions.count()));
    }
    ResponseConverter<UuidsResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<UuidsResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve one or more UUIDs.
   *
   * Requests one or more Universally Unique Identifiers (UUIDs) from the instance. The response is a JSON object that
   * provides a list of UUIDs.
   *
   * @return a {@link ServiceCall} with a result of type {@link UuidsResult}
   */
  public ServiceCall<UuidsResult> getUuids() {
    return getUuids(null);
  }

  /**
   * Retrieve the HTTP headers for a database.
   *
   * Returns the HTTP headers that contain a minimal amount of information about the specified database. Since the
   * response body is empty, using the HEAD method is a lightweight way to check if the database exists or not.
   *
   * @param headDatabaseOptions the {@link HeadDatabaseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> headDatabase(HeadDatabaseOptions headDatabaseOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(headDatabaseOptions,
      "headDatabaseOptions cannot be null");
    String[] pathSegments = { "" };
    String[] pathParameters = { headDatabaseOptions.db() };
    RequestBuilder builder = RequestBuilder.head(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "headDatabase");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a list of all database names in the instance.
   *
   * @param getAllDbsOptions the {@link GetAllDbsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<String>> getAllDbs(GetAllDbsOptions getAllDbsOptions) {
    if (getAllDbsOptions == null) {
      getAllDbsOptions = new GetAllDbsOptions.Builder().build();
    }
    String[] pathSegments = { "_all_dbs" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getAllDbs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getAllDbsOptions.descending() != null) {
      builder.query("descending", String.valueOf(getAllDbsOptions.descending()));
    }
    if (getAllDbsOptions.endkey() != null) {
      builder.query("endkey", getAllDbsOptions.endkey());
    }
    if (getAllDbsOptions.limit() != null) {
      builder.query("limit", String.valueOf(getAllDbsOptions.limit()));
    }
    if (getAllDbsOptions.skip() != null) {
      builder.query("skip", String.valueOf(getAllDbsOptions.skip()));
    }
    if (getAllDbsOptions.startkey() != null) {
      builder.query("startkey", getAllDbsOptions.startkey());
    }
    ResponseConverter<List<String>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<String>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a list of all database names in the instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<String>> getAllDbs() {
    return getAllDbs(null);
  }

  /**
   * Query information about multiple databases.
   *
   * This operation enables you to request information about multiple databases in a single request, instead of issuing
   * multiple `GET /{db}` requests. It returns a list that contains an information object for each database specified in
   * the request.
   *
   * @param postDbsInfoOptions the {@link PostDbsInfoOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<DbsInfoResult>> postDbsInfo(PostDbsInfoOptions postDbsInfoOptions) {
    boolean skipBody = false;
    if (postDbsInfoOptions == null) {
      postDbsInfoOptions = new PostDbsInfoOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "_dbs_info" };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postDbsInfo");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (postDbsInfoOptions.keys() != null) {
        contentJson.add("keys", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postDbsInfoOptions.keys()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<List<DbsInfoResult>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<DbsInfoResult>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query information about multiple databases.
   *
   * This operation enables you to request information about multiple databases in a single request, instead of issuing
   * multiple `GET /{db}` requests. It returns a list that contains an information object for each database specified in
   * the request.
   *
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<DbsInfoResult>> postDbsInfo() {
    return postDbsInfo(null);
  }

  /**
   * Delete a database.
   *
   * Deletes the specified database and all documents and attachments contained within it. To avoid deleting a database,
   * the server responds with a 400 HTTP status code when the request URL includes a `?rev=` parameter. This response
   * suggests that a user wanted to delete a document but forgot to add the document ID to the URL.
   *
   * @param deleteDatabaseOptions the {@link DeleteDatabaseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Ok}
   */
  public ServiceCall<Ok> deleteDatabase(DeleteDatabaseOptions deleteDatabaseOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDatabaseOptions,
      "deleteDatabaseOptions cannot be null");
    String[] pathSegments = { "" };
    String[] pathParameters = { deleteDatabaseOptions.db() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "deleteDatabase");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Ok> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Ok>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve information about a database.
   *
   * @param getDatabaseInformationOptions the {@link GetDatabaseInformationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DatabaseInformation}
   */
  public ServiceCall<DatabaseInformation> getDatabaseInformation(GetDatabaseInformationOptions getDatabaseInformationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDatabaseInformationOptions,
      "getDatabaseInformationOptions cannot be null");
    String[] pathSegments = { "" };
    String[] pathParameters = { getDatabaseInformationOptions.db() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getDatabaseInformation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DatabaseInformation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DatabaseInformation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a database.
   *
   * @param putDatabaseOptions the {@link PutDatabaseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Ok}
   */
  public ServiceCall<Ok> putDatabase(PutDatabaseOptions putDatabaseOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(putDatabaseOptions,
      "putDatabaseOptions cannot be null");
    String[] pathSegments = { "" };
    String[] pathParameters = { putDatabaseOptions.db() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "putDatabase");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (putDatabaseOptions.partitioned() != null) {
      builder.query("partitioned", String.valueOf(putDatabaseOptions.partitioned()));
    }
    if (putDatabaseOptions.q() != null) {
      builder.query("q", String.valueOf(putDatabaseOptions.q()));
    }
    ResponseConverter<Ok> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Ok>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query the database document changes feed.
   *
   * Requests the database changes feed in the same way as `GET /{db}/_changes` does. It is widely used with the
   * `filter` query parameter because it allows one to pass more information to the filter.
   *
   * @param postChangesOptions the {@link PostChangesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ChangesResult}
   */
  public ServiceCall<ChangesResult> postChanges(PostChangesOptions postChangesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postChangesOptions,
      "postChangesOptions cannot be null");
    String[] pathSegments = { "", "_changes" };
    String[] pathParameters = { postChangesOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postChanges");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (postChangesOptions.lastEventId() != null) {
      builder.header("Last-Event-ID", postChangesOptions.lastEventId());
    }
    if (postChangesOptions.attEncodingInfo() != null) {
      builder.query("att_encoding_info", String.valueOf(postChangesOptions.attEncodingInfo()));
    }
    if (postChangesOptions.attachments() != null) {
      builder.query("attachments", String.valueOf(postChangesOptions.attachments()));
    }
    if (postChangesOptions.conflicts() != null) {
      builder.query("conflicts", String.valueOf(postChangesOptions.conflicts()));
    }
    if (postChangesOptions.descending() != null) {
      builder.query("descending", String.valueOf(postChangesOptions.descending()));
    }
    if (postChangesOptions.feed() != null) {
      builder.query("feed", postChangesOptions.feed());
    }
    if (postChangesOptions.filter() != null) {
      builder.query("filter", postChangesOptions.filter());
    }
    if (postChangesOptions.heartbeat() != null) {
      builder.query("heartbeat", String.valueOf(postChangesOptions.heartbeat()));
    }
    if (postChangesOptions.includeDocs() != null) {
      builder.query("include_docs", String.valueOf(postChangesOptions.includeDocs()));
    }
    if (postChangesOptions.limit() != null) {
      builder.query("limit", String.valueOf(postChangesOptions.limit()));
    }
    if (postChangesOptions.seqInterval() != null) {
      builder.query("seq_interval", String.valueOf(postChangesOptions.seqInterval()));
    }
    if (postChangesOptions.since() != null) {
      builder.query("since", postChangesOptions.since());
    }
    if (postChangesOptions.style() != null) {
      builder.query("style", postChangesOptions.style());
    }
    if (postChangesOptions.timeout() != null) {
      builder.query("timeout", String.valueOf(postChangesOptions.timeout()));
    }
    if (postChangesOptions.view() != null) {
      builder.query("view", postChangesOptions.view());
    }
    final JsonObject contentJson = new JsonObject();
    if (postChangesOptions.docIds() != null) {
      contentJson.add("doc_ids", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postChangesOptions.docIds()));
    }
    if (postChangesOptions.fields() != null) {
      contentJson.add("fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postChangesOptions.fields()));
    }
    if (postChangesOptions.selector() != null) {
      contentJson.add("selector", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postChangesOptions.selector()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ChangesResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ChangesResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query the database document changes feed as stream.
   *
   * Requests the database changes feed in the same way as `GET /{db}/_changes` does. It is widely used with the
   * `filter` query parameter because it allows one to pass more information to the filter.
   *
   * @param postChangesOptions the {@link PostChangesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postChangesAsStream(PostChangesOptions postChangesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postChangesOptions,
      "postChangesOptions cannot be null");
    String[] pathSegments = { "", "_changes" };
    String[] pathParameters = { postChangesOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postChangesAsStream");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (postChangesOptions.lastEventId() != null) {
      builder.header("Last-Event-ID", postChangesOptions.lastEventId());
    }
    if (postChangesOptions.attEncodingInfo() != null) {
      builder.query("att_encoding_info", String.valueOf(postChangesOptions.attEncodingInfo()));
    }
    if (postChangesOptions.attachments() != null) {
      builder.query("attachments", String.valueOf(postChangesOptions.attachments()));
    }
    if (postChangesOptions.conflicts() != null) {
      builder.query("conflicts", String.valueOf(postChangesOptions.conflicts()));
    }
    if (postChangesOptions.descending() != null) {
      builder.query("descending", String.valueOf(postChangesOptions.descending()));
    }
    if (postChangesOptions.feed() != null) {
      builder.query("feed", postChangesOptions.feed());
    }
    if (postChangesOptions.filter() != null) {
      builder.query("filter", postChangesOptions.filter());
    }
    if (postChangesOptions.heartbeat() != null) {
      builder.query("heartbeat", String.valueOf(postChangesOptions.heartbeat()));
    }
    if (postChangesOptions.includeDocs() != null) {
      builder.query("include_docs", String.valueOf(postChangesOptions.includeDocs()));
    }
    if (postChangesOptions.limit() != null) {
      builder.query("limit", String.valueOf(postChangesOptions.limit()));
    }
    if (postChangesOptions.seqInterval() != null) {
      builder.query("seq_interval", String.valueOf(postChangesOptions.seqInterval()));
    }
    if (postChangesOptions.since() != null) {
      builder.query("since", postChangesOptions.since());
    }
    if (postChangesOptions.style() != null) {
      builder.query("style", postChangesOptions.style());
    }
    if (postChangesOptions.timeout() != null) {
      builder.query("timeout", String.valueOf(postChangesOptions.timeout()));
    }
    if (postChangesOptions.view() != null) {
      builder.query("view", postChangesOptions.view());
    }
    final JsonObject contentJson = new JsonObject();
    if (postChangesOptions.docIds() != null) {
      contentJson.add("doc_ids", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postChangesOptions.docIds()));
    }
    if (postChangesOptions.fields() != null) {
      contentJson.add("fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postChangesOptions.fields()));
    }
    if (postChangesOptions.selector() != null) {
      contentJson.add("selector", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postChangesOptions.selector()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the HTTP headers for the document.
   *
   * This method supports the same query arguments as the `GET /{db}/{docid}` method, but only the header information
   * (including document size and the revision as an ETag) is returned. The ETag header shows the current revision for
   * the requested document, and the Content-Length specifies the length of the data if the document was requested in
   * full. Add any of the query arguments, then the resulting HTTP headers that correspond to it are returned.
   *
   * @param headDocumentOptions the {@link HeadDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> headDocument(HeadDocumentOptions headDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(headDocumentOptions,
      "headDocumentOptions cannot be null");
    String[] pathSegments = { "", "" };
    String[] pathParameters = { headDocumentOptions.db(), headDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.head(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "headDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (headDocumentOptions.ifNoneMatch() != null) {
      builder.header("If-None-Match", headDocumentOptions.ifNoneMatch());
    }
    if (headDocumentOptions.latest() != null) {
      builder.query("latest", String.valueOf(headDocumentOptions.latest()));
    }
    if (headDocumentOptions.rev() != null) {
      builder.query("rev", headDocumentOptions.rev());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create or modify a document in a database.
   *
   * Creates or modifies a document in the specified database by using the supplied JSON document. If the JSON document
   * doesn't specify an `_id` field, then the document is created with a new unique ID generated by the UUID algorithm
   * that is configured for the server. If the document includes the `_id` field, then it is created with that `_id` or
   * updated if the `_id` already exists, and an appropriate `_rev` is included in the JSON document. If the `_id`
   * includes the `_local` or `_design` prefix, then this operation is used to create or modify local or design
   * documents respectively.
   *
   * @param postDocumentOptions the {@link PostDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DocumentResult}
   */
  public ServiceCall<DocumentResult> postDocument(PostDocumentOptions postDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postDocumentOptions,
      "postDocumentOptions cannot be null");
    String[] pathSegments = { "" };
    String[] pathParameters = { postDocumentOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (postDocumentOptions.contentType() != null) {
      builder.header("Content-Type", postDocumentOptions.contentType());
    }
    if (postDocumentOptions.batch() != null) {
      builder.query("batch", postDocumentOptions.batch());
    }
    String contentType = postDocumentOptions.contentType() == null ? "application/json" : postDocumentOptions.contentType();
    builder.bodyContent(contentType, postDocumentOptions.document(),
      null, postDocumentOptions.body());
    ResponseConverter<DocumentResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DocumentResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a list of all documents in a database.
   *
   * Queries the primary index (all document IDs). The results that match the request body parameters are returned in a
   * JSON object, including a list of matching documents with basic contents, such as the ID and revision. When no
   * request body parameters are specified, results for all documents in the database are returned. Optionally, document
   * content or additional metadata can be included in the response.
   *
   * @param postAllDocsOptions the {@link PostAllDocsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AllDocsResult}
   */
  public ServiceCall<AllDocsResult> postAllDocs(PostAllDocsOptions postAllDocsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postAllDocsOptions,
      "postAllDocsOptions cannot be null");
    String[] pathSegments = { "", "_all_docs" };
    String[] pathParameters = { postAllDocsOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postAllDocs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postAllDocsOptions.attEncodingInfo() != null) {
      contentJson.addProperty("att_encoding_info", postAllDocsOptions.attEncodingInfo());
    }
    if (postAllDocsOptions.attachments() != null) {
      contentJson.addProperty("attachments", postAllDocsOptions.attachments());
    }
    if (postAllDocsOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postAllDocsOptions.conflicts());
    }
    if (postAllDocsOptions.descending() != null) {
      contentJson.addProperty("descending", postAllDocsOptions.descending());
    }
    if (postAllDocsOptions.includeDocs() != null) {
      contentJson.addProperty("include_docs", postAllDocsOptions.includeDocs());
    }
    if (postAllDocsOptions.inclusiveEnd() != null) {
      contentJson.addProperty("inclusive_end", postAllDocsOptions.inclusiveEnd());
    }
    if (postAllDocsOptions.limit() != null) {
      contentJson.addProperty("limit", postAllDocsOptions.limit());
    }
    if (postAllDocsOptions.skip() != null) {
      contentJson.addProperty("skip", postAllDocsOptions.skip());
    }
    if (postAllDocsOptions.updateSeq() != null) {
      contentJson.addProperty("update_seq", postAllDocsOptions.updateSeq());
    }
    if (postAllDocsOptions.endkey() != null) {
      contentJson.addProperty("endkey", postAllDocsOptions.endkey());
    }
    if (postAllDocsOptions.key() != null) {
      contentJson.addProperty("key", postAllDocsOptions.key());
    }
    if (postAllDocsOptions.keys() != null) {
      contentJson.add("keys", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postAllDocsOptions.keys()));
    }
    if (postAllDocsOptions.startkey() != null) {
      contentJson.addProperty("startkey", postAllDocsOptions.startkey());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AllDocsResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AllDocsResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a list of all documents in a database as stream.
   *
   * Queries the primary index (all document IDs). The results that match the request body parameters are returned in a
   * JSON object, including a list of matching documents with basic contents, such as the ID and revision. When no
   * request body parameters are specified, results for all documents in the database are returned. Optionally, document
   * content or additional metadata can be included in the response.
   *
   * @param postAllDocsOptions the {@link PostAllDocsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postAllDocsAsStream(PostAllDocsOptions postAllDocsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postAllDocsOptions,
      "postAllDocsOptions cannot be null");
    String[] pathSegments = { "", "_all_docs" };
    String[] pathParameters = { postAllDocsOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postAllDocsAsStream");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postAllDocsOptions.attEncodingInfo() != null) {
      contentJson.addProperty("att_encoding_info", postAllDocsOptions.attEncodingInfo());
    }
    if (postAllDocsOptions.attachments() != null) {
      contentJson.addProperty("attachments", postAllDocsOptions.attachments());
    }
    if (postAllDocsOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postAllDocsOptions.conflicts());
    }
    if (postAllDocsOptions.descending() != null) {
      contentJson.addProperty("descending", postAllDocsOptions.descending());
    }
    if (postAllDocsOptions.includeDocs() != null) {
      contentJson.addProperty("include_docs", postAllDocsOptions.includeDocs());
    }
    if (postAllDocsOptions.inclusiveEnd() != null) {
      contentJson.addProperty("inclusive_end", postAllDocsOptions.inclusiveEnd());
    }
    if (postAllDocsOptions.limit() != null) {
      contentJson.addProperty("limit", postAllDocsOptions.limit());
    }
    if (postAllDocsOptions.skip() != null) {
      contentJson.addProperty("skip", postAllDocsOptions.skip());
    }
    if (postAllDocsOptions.updateSeq() != null) {
      contentJson.addProperty("update_seq", postAllDocsOptions.updateSeq());
    }
    if (postAllDocsOptions.endkey() != null) {
      contentJson.addProperty("endkey", postAllDocsOptions.endkey());
    }
    if (postAllDocsOptions.key() != null) {
      contentJson.addProperty("key", postAllDocsOptions.key());
    }
    if (postAllDocsOptions.keys() != null) {
      contentJson.add("keys", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postAllDocsOptions.keys()));
    }
    if (postAllDocsOptions.startkey() != null) {
      contentJson.addProperty("startkey", postAllDocsOptions.startkey());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Multi-query the list of all documents in a database.
   *
   * Runs multiple queries using the primary index (all document IDs). Returns a JSON object that contains a list of
   * result objects, one for each query, with a structure equivalent to that of a single `_all_docs` request. This
   * enables you to request multiple queries in a single request, in place of multiple `POST /{db}/_all_docs` requests.
   *
   * @param postAllDocsQueriesOptions the {@link PostAllDocsQueriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AllDocsQueriesResult}
   */
  public ServiceCall<AllDocsQueriesResult> postAllDocsQueries(PostAllDocsQueriesOptions postAllDocsQueriesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postAllDocsQueriesOptions,
      "postAllDocsQueriesOptions cannot be null");
    String[] pathSegments = { "", "_all_docs/queries" };
    String[] pathParameters = { postAllDocsQueriesOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postAllDocsQueries");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postAllDocsQueriesOptions.queries() != null) {
      contentJson.add("queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postAllDocsQueriesOptions.queries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AllDocsQueriesResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AllDocsQueriesResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Multi-query the list of all documents in a database as stream.
   *
   * Runs multiple queries using the primary index (all document IDs). Returns a JSON object that contains a list of
   * result objects, one for each query, with a structure equivalent to that of a single `_all_docs` request. This
   * enables you to request multiple queries in a single request, in place of multiple `POST /{db}/_all_docs` requests.
   *
   * @param postAllDocsQueriesOptions the {@link PostAllDocsQueriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postAllDocsQueriesAsStream(PostAllDocsQueriesOptions postAllDocsQueriesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postAllDocsQueriesOptions,
      "postAllDocsQueriesOptions cannot be null");
    String[] pathSegments = { "", "_all_docs/queries" };
    String[] pathParameters = { postAllDocsQueriesOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postAllDocsQueriesAsStream");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postAllDocsQueriesOptions.queries() != null) {
      contentJson.add("queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postAllDocsQueriesOptions.queries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Bulk modify multiple documents in a database.
   *
   * The bulk document API allows you to create and update multiple documents at the same time within a single request.
   * The basic operation is similar to creating or updating a single document, except that you batch the document
   * structure and information.
   *
   * @param postBulkDocsOptions the {@link PostBulkDocsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<DocumentResult>> postBulkDocs(PostBulkDocsOptions postBulkDocsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postBulkDocsOptions,
      "postBulkDocsOptions cannot be null");
    String[] pathSegments = { "", "_bulk_docs" };
    String[] pathParameters = { postBulkDocsOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postBulkDocs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent("application/json", postBulkDocsOptions.bulkDocs(),
      null, postBulkDocsOptions.body());
    ResponseConverter<List<DocumentResult>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<DocumentResult>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Bulk query revision information for multiple documents.
   *
   * Fetch specific revisions or revision histories for multiple documents in bulk as replicators do.
   *
   * @param postBulkGetOptions the {@link PostBulkGetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BulkGetResult}
   */
  public ServiceCall<BulkGetResult> postBulkGet(PostBulkGetOptions postBulkGetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postBulkGetOptions,
      "postBulkGetOptions cannot be null");
    String[] pathSegments = { "", "_bulk_get" };
    String[] pathParameters = { postBulkGetOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postBulkGet");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (postBulkGetOptions.attachments() != null) {
      builder.query("attachments", String.valueOf(postBulkGetOptions.attachments()));
    }
    if (postBulkGetOptions.attEncodingInfo() != null) {
      builder.query("att_encoding_info", String.valueOf(postBulkGetOptions.attEncodingInfo()));
    }
    if (postBulkGetOptions.latest() != null) {
      builder.query("latest", String.valueOf(postBulkGetOptions.latest()));
    }
    if (postBulkGetOptions.revs() != null) {
      builder.query("revs", String.valueOf(postBulkGetOptions.revs()));
    }
    final JsonObject contentJson = new JsonObject();
    if (postBulkGetOptions.docs() != null) {
      contentJson.add("docs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postBulkGetOptions.docs()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<BulkGetResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BulkGetResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Bulk query revision information for multiple documents as mixed.
   *
   * Fetch specific revisions or revision histories for multiple documents in bulk as replicators do.
   *
   * @param postBulkGetOptions the {@link PostBulkGetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postBulkGetAsMixed(PostBulkGetOptions postBulkGetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postBulkGetOptions,
      "postBulkGetOptions cannot be null");
    String[] pathSegments = { "", "_bulk_get" };
    String[] pathParameters = { postBulkGetOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postBulkGetAsMixed");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "multipart/mixed");
    if (postBulkGetOptions.attachments() != null) {
      builder.query("attachments", String.valueOf(postBulkGetOptions.attachments()));
    }
    if (postBulkGetOptions.attEncodingInfo() != null) {
      builder.query("att_encoding_info", String.valueOf(postBulkGetOptions.attEncodingInfo()));
    }
    if (postBulkGetOptions.latest() != null) {
      builder.query("latest", String.valueOf(postBulkGetOptions.latest()));
    }
    if (postBulkGetOptions.revs() != null) {
      builder.query("revs", String.valueOf(postBulkGetOptions.revs()));
    }
    final JsonObject contentJson = new JsonObject();
    if (postBulkGetOptions.docs() != null) {
      contentJson.add("docs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postBulkGetOptions.docs()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Bulk query revision information for multiple documents as related.
   *
   * Fetch specific revisions or revision histories for multiple documents in bulk as replicators do.
   *
   * @param postBulkGetOptions the {@link PostBulkGetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postBulkGetAsRelated(PostBulkGetOptions postBulkGetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postBulkGetOptions,
      "postBulkGetOptions cannot be null");
    String[] pathSegments = { "", "_bulk_get" };
    String[] pathParameters = { postBulkGetOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postBulkGetAsRelated");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "multipart/related");
    if (postBulkGetOptions.attachments() != null) {
      builder.query("attachments", String.valueOf(postBulkGetOptions.attachments()));
    }
    if (postBulkGetOptions.attEncodingInfo() != null) {
      builder.query("att_encoding_info", String.valueOf(postBulkGetOptions.attEncodingInfo()));
    }
    if (postBulkGetOptions.latest() != null) {
      builder.query("latest", String.valueOf(postBulkGetOptions.latest()));
    }
    if (postBulkGetOptions.revs() != null) {
      builder.query("revs", String.valueOf(postBulkGetOptions.revs()));
    }
    final JsonObject contentJson = new JsonObject();
    if (postBulkGetOptions.docs() != null) {
      contentJson.add("docs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postBulkGetOptions.docs()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Bulk query revision information for multiple documents as stream.
   *
   * Fetch specific revisions or revision histories for multiple documents in bulk as replicators do.
   *
   * @param postBulkGetOptions the {@link PostBulkGetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postBulkGetAsStream(PostBulkGetOptions postBulkGetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postBulkGetOptions,
      "postBulkGetOptions cannot be null");
    String[] pathSegments = { "", "_bulk_get" };
    String[] pathParameters = { postBulkGetOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postBulkGetAsStream");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (postBulkGetOptions.attachments() != null) {
      builder.query("attachments", String.valueOf(postBulkGetOptions.attachments()));
    }
    if (postBulkGetOptions.attEncodingInfo() != null) {
      builder.query("att_encoding_info", String.valueOf(postBulkGetOptions.attEncodingInfo()));
    }
    if (postBulkGetOptions.latest() != null) {
      builder.query("latest", String.valueOf(postBulkGetOptions.latest()));
    }
    if (postBulkGetOptions.revs() != null) {
      builder.query("revs", String.valueOf(postBulkGetOptions.revs()));
    }
    final JsonObject contentJson = new JsonObject();
    if (postBulkGetOptions.docs() != null) {
      contentJson.add("docs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postBulkGetOptions.docs()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a document.
   *
   * Marks the specified document as deleted by adding a `_deleted` field with the value `true`. Documents with this
   * field are not returned within requests anymore but stay in the database. You must supply the current (latest)
   * revision, either by using the `rev` parameter or by using the `If-Match` header to specify the revision.
   *
   * @param deleteDocumentOptions the {@link DeleteDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DocumentResult}
   */
  public ServiceCall<DocumentResult> deleteDocument(DeleteDocumentOptions deleteDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDocumentOptions,
      "deleteDocumentOptions cannot be null");
    String[] pathSegments = { "", "" };
    String[] pathParameters = { deleteDocumentOptions.db(), deleteDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "deleteDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteDocumentOptions.ifMatch() != null) {
      builder.header("If-Match", deleteDocumentOptions.ifMatch());
    }
    if (deleteDocumentOptions.batch() != null) {
      builder.query("batch", deleteDocumentOptions.batch());
    }
    if (deleteDocumentOptions.rev() != null) {
      builder.query("rev", deleteDocumentOptions.rev());
    }
    ResponseConverter<DocumentResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DocumentResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a document.
   *
   * Returns document with the specified `doc_id` from the specified database. Unless you request a specific revision,
   * the latest revision of the document is always returned.
   *
   * @param getDocumentOptions the {@link GetDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Document}
   */
  public ServiceCall<Document> getDocument(GetDocumentOptions getDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDocumentOptions,
      "getDocumentOptions cannot be null");
    String[] pathSegments = { "", "" };
    String[] pathParameters = { getDocumentOptions.db(), getDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getDocumentOptions.ifNoneMatch() != null) {
      builder.header("If-None-Match", getDocumentOptions.ifNoneMatch());
    }
    if (getDocumentOptions.attachments() != null) {
      builder.query("attachments", String.valueOf(getDocumentOptions.attachments()));
    }
    if (getDocumentOptions.attEncodingInfo() != null) {
      builder.query("att_encoding_info", String.valueOf(getDocumentOptions.attEncodingInfo()));
    }
    if (getDocumentOptions.attsSince() != null) {
      builder.query("atts_since", RequestUtils.join(getDocumentOptions.attsSince(), ","));
    }
    if (getDocumentOptions.conflicts() != null) {
      builder.query("conflicts", String.valueOf(getDocumentOptions.conflicts()));
    }
    if (getDocumentOptions.deletedConflicts() != null) {
      builder.query("deleted_conflicts", String.valueOf(getDocumentOptions.deletedConflicts()));
    }
    if (getDocumentOptions.latest() != null) {
      builder.query("latest", String.valueOf(getDocumentOptions.latest()));
    }
    if (getDocumentOptions.localSeq() != null) {
      builder.query("local_seq", String.valueOf(getDocumentOptions.localSeq()));
    }
    if (getDocumentOptions.meta() != null) {
      builder.query("meta", String.valueOf(getDocumentOptions.meta()));
    }
    if (getDocumentOptions.openRevs() != null) {
      builder.query("open_revs", RequestUtils.join(getDocumentOptions.openRevs(), ","));
    }
    if (getDocumentOptions.rev() != null) {
      builder.query("rev", getDocumentOptions.rev());
    }
    if (getDocumentOptions.revs() != null) {
      builder.query("revs", String.valueOf(getDocumentOptions.revs()));
    }
    if (getDocumentOptions.revsInfo() != null) {
      builder.query("revs_info", String.valueOf(getDocumentOptions.revsInfo()));
    }
    ResponseConverter<Document> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Document>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a document as mixed.
   *
   * Returns document with the specified `doc_id` from the specified database. Unless you request a specific revision,
   * the latest revision of the document is always returned.
   *
   * @param getDocumentOptions the {@link GetDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getDocumentAsMixed(GetDocumentOptions getDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDocumentOptions,
      "getDocumentOptions cannot be null");
    String[] pathSegments = { "", "" };
    String[] pathParameters = { getDocumentOptions.db(), getDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getDocumentAsMixed");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "multipart/mixed");
    if (getDocumentOptions.ifNoneMatch() != null) {
      builder.header("If-None-Match", getDocumentOptions.ifNoneMatch());
    }
    if (getDocumentOptions.attachments() != null) {
      builder.query("attachments", String.valueOf(getDocumentOptions.attachments()));
    }
    if (getDocumentOptions.attEncodingInfo() != null) {
      builder.query("att_encoding_info", String.valueOf(getDocumentOptions.attEncodingInfo()));
    }
    if (getDocumentOptions.attsSince() != null) {
      builder.query("atts_since", RequestUtils.join(getDocumentOptions.attsSince(), ","));
    }
    if (getDocumentOptions.conflicts() != null) {
      builder.query("conflicts", String.valueOf(getDocumentOptions.conflicts()));
    }
    if (getDocumentOptions.deletedConflicts() != null) {
      builder.query("deleted_conflicts", String.valueOf(getDocumentOptions.deletedConflicts()));
    }
    if (getDocumentOptions.latest() != null) {
      builder.query("latest", String.valueOf(getDocumentOptions.latest()));
    }
    if (getDocumentOptions.localSeq() != null) {
      builder.query("local_seq", String.valueOf(getDocumentOptions.localSeq()));
    }
    if (getDocumentOptions.meta() != null) {
      builder.query("meta", String.valueOf(getDocumentOptions.meta()));
    }
    if (getDocumentOptions.openRevs() != null) {
      builder.query("open_revs", RequestUtils.join(getDocumentOptions.openRevs(), ","));
    }
    if (getDocumentOptions.rev() != null) {
      builder.query("rev", getDocumentOptions.rev());
    }
    if (getDocumentOptions.revs() != null) {
      builder.query("revs", String.valueOf(getDocumentOptions.revs()));
    }
    if (getDocumentOptions.revsInfo() != null) {
      builder.query("revs_info", String.valueOf(getDocumentOptions.revsInfo()));
    }
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a document as related.
   *
   * Returns document with the specified `doc_id` from the specified database. Unless you request a specific revision,
   * the latest revision of the document is always returned.
   *
   * @param getDocumentOptions the {@link GetDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getDocumentAsRelated(GetDocumentOptions getDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDocumentOptions,
      "getDocumentOptions cannot be null");
    String[] pathSegments = { "", "" };
    String[] pathParameters = { getDocumentOptions.db(), getDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getDocumentAsRelated");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "multipart/related");
    if (getDocumentOptions.ifNoneMatch() != null) {
      builder.header("If-None-Match", getDocumentOptions.ifNoneMatch());
    }
    if (getDocumentOptions.attachments() != null) {
      builder.query("attachments", String.valueOf(getDocumentOptions.attachments()));
    }
    if (getDocumentOptions.attEncodingInfo() != null) {
      builder.query("att_encoding_info", String.valueOf(getDocumentOptions.attEncodingInfo()));
    }
    if (getDocumentOptions.attsSince() != null) {
      builder.query("atts_since", RequestUtils.join(getDocumentOptions.attsSince(), ","));
    }
    if (getDocumentOptions.conflicts() != null) {
      builder.query("conflicts", String.valueOf(getDocumentOptions.conflicts()));
    }
    if (getDocumentOptions.deletedConflicts() != null) {
      builder.query("deleted_conflicts", String.valueOf(getDocumentOptions.deletedConflicts()));
    }
    if (getDocumentOptions.latest() != null) {
      builder.query("latest", String.valueOf(getDocumentOptions.latest()));
    }
    if (getDocumentOptions.localSeq() != null) {
      builder.query("local_seq", String.valueOf(getDocumentOptions.localSeq()));
    }
    if (getDocumentOptions.meta() != null) {
      builder.query("meta", String.valueOf(getDocumentOptions.meta()));
    }
    if (getDocumentOptions.openRevs() != null) {
      builder.query("open_revs", RequestUtils.join(getDocumentOptions.openRevs(), ","));
    }
    if (getDocumentOptions.rev() != null) {
      builder.query("rev", getDocumentOptions.rev());
    }
    if (getDocumentOptions.revs() != null) {
      builder.query("revs", String.valueOf(getDocumentOptions.revs()));
    }
    if (getDocumentOptions.revsInfo() != null) {
      builder.query("revs_info", String.valueOf(getDocumentOptions.revsInfo()));
    }
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a document as stream.
   *
   * Returns document with the specified `doc_id` from the specified database. Unless you request a specific revision,
   * the latest revision of the document is always returned.
   *
   * @param getDocumentOptions the {@link GetDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getDocumentAsStream(GetDocumentOptions getDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDocumentOptions,
      "getDocumentOptions cannot be null");
    String[] pathSegments = { "", "" };
    String[] pathParameters = { getDocumentOptions.db(), getDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getDocumentAsStream");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getDocumentOptions.ifNoneMatch() != null) {
      builder.header("If-None-Match", getDocumentOptions.ifNoneMatch());
    }
    if (getDocumentOptions.attachments() != null) {
      builder.query("attachments", String.valueOf(getDocumentOptions.attachments()));
    }
    if (getDocumentOptions.attEncodingInfo() != null) {
      builder.query("att_encoding_info", String.valueOf(getDocumentOptions.attEncodingInfo()));
    }
    if (getDocumentOptions.attsSince() != null) {
      builder.query("atts_since", RequestUtils.join(getDocumentOptions.attsSince(), ","));
    }
    if (getDocumentOptions.conflicts() != null) {
      builder.query("conflicts", String.valueOf(getDocumentOptions.conflicts()));
    }
    if (getDocumentOptions.deletedConflicts() != null) {
      builder.query("deleted_conflicts", String.valueOf(getDocumentOptions.deletedConflicts()));
    }
    if (getDocumentOptions.latest() != null) {
      builder.query("latest", String.valueOf(getDocumentOptions.latest()));
    }
    if (getDocumentOptions.localSeq() != null) {
      builder.query("local_seq", String.valueOf(getDocumentOptions.localSeq()));
    }
    if (getDocumentOptions.meta() != null) {
      builder.query("meta", String.valueOf(getDocumentOptions.meta()));
    }
    if (getDocumentOptions.openRevs() != null) {
      builder.query("open_revs", RequestUtils.join(getDocumentOptions.openRevs(), ","));
    }
    if (getDocumentOptions.rev() != null) {
      builder.query("rev", getDocumentOptions.rev());
    }
    if (getDocumentOptions.revs() != null) {
      builder.query("revs", String.valueOf(getDocumentOptions.revs()));
    }
    if (getDocumentOptions.revsInfo() != null) {
      builder.query("revs_info", String.valueOf(getDocumentOptions.revsInfo()));
    }
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create or modify a document.
   *
   * The PUT method creates a new named document, or creates a new revision of the existing document. Unlike the `POST
   * /{db}` request, you must specify the document ID in the request URL.
   *
   * @param putDocumentOptions the {@link PutDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DocumentResult}
   */
  public ServiceCall<DocumentResult> putDocument(PutDocumentOptions putDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(putDocumentOptions,
      "putDocumentOptions cannot be null");
    String[] pathSegments = { "", "" };
    String[] pathParameters = { putDocumentOptions.db(), putDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "putDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (putDocumentOptions.contentType() != null) {
      builder.header("Content-Type", putDocumentOptions.contentType());
    }
    if (putDocumentOptions.ifMatch() != null) {
      builder.header("If-Match", putDocumentOptions.ifMatch());
    }
    if (putDocumentOptions.batch() != null) {
      builder.query("batch", putDocumentOptions.batch());
    }
    if (putDocumentOptions.newEdits() != null) {
      builder.query("new_edits", String.valueOf(putDocumentOptions.newEdits()));
    }
    if (putDocumentOptions.rev() != null) {
      builder.query("rev", putDocumentOptions.rev());
    }
    String contentType = putDocumentOptions.contentType() == null ? "application/json" : putDocumentOptions.contentType();
    builder.bodyContent(contentType, putDocumentOptions.document(),
      null, putDocumentOptions.body());
    ResponseConverter<DocumentResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DocumentResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the HTTP headers for a design document.
   *
   * This method supports the same query arguments as the `GET /{db}/_design/{ddoc}` method, but the results include
   * only the header information (including design document size, and the revision as an ETag). The ETag header shows
   * the current revision for the requested design document, and if you requested the design document in full, the
   * Content-Length specifies the length of the data. If you add any of the query arguments, then the resulting HTTP
   * headers correspond to what is returned for the equivalent GET request.
   *
   * @param headDesignDocumentOptions the {@link HeadDesignDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> headDesignDocument(HeadDesignDocumentOptions headDesignDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(headDesignDocumentOptions,
      "headDesignDocumentOptions cannot be null");
    String[] pathSegments = { "", "_design" };
    String[] pathParameters = { headDesignDocumentOptions.db(), headDesignDocumentOptions.ddoc() };
    RequestBuilder builder = RequestBuilder.head(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "headDesignDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (headDesignDocumentOptions.ifNoneMatch() != null) {
      builder.header("If-None-Match", headDesignDocumentOptions.ifNoneMatch());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a design document.
   *
   * Marks the specified design document as deleted by adding a `_deleted` field with the value `true`. Documents with
   * this field are not returned with requests but stay in the database. You must supply the current (latest) revision,
   * either by using the `rev` parameter or by using the `If-Match` header to specify the revision.
   *
   * @param deleteDesignDocumentOptions the {@link DeleteDesignDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DocumentResult}
   */
  public ServiceCall<DocumentResult> deleteDesignDocument(DeleteDesignDocumentOptions deleteDesignDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDesignDocumentOptions,
      "deleteDesignDocumentOptions cannot be null");
    String[] pathSegments = { "", "_design" };
    String[] pathParameters = { deleteDesignDocumentOptions.db(), deleteDesignDocumentOptions.ddoc() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "deleteDesignDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteDesignDocumentOptions.ifMatch() != null) {
      builder.header("If-Match", deleteDesignDocumentOptions.ifMatch());
    }
    if (deleteDesignDocumentOptions.batch() != null) {
      builder.query("batch", deleteDesignDocumentOptions.batch());
    }
    if (deleteDesignDocumentOptions.rev() != null) {
      builder.query("rev", deleteDesignDocumentOptions.rev());
    }
    ResponseConverter<DocumentResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DocumentResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a design document.
   *
   * Returns design document with the specified `doc_id` from the specified database. Unless you request a specific
   * revision, the current revision of the design document is always returned.
   *
   * @param getDesignDocumentOptions the {@link GetDesignDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DesignDocument}
   */
  public ServiceCall<DesignDocument> getDesignDocument(GetDesignDocumentOptions getDesignDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDesignDocumentOptions,
      "getDesignDocumentOptions cannot be null");
    String[] pathSegments = { "", "_design" };
    String[] pathParameters = { getDesignDocumentOptions.db(), getDesignDocumentOptions.ddoc() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getDesignDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getDesignDocumentOptions.ifNoneMatch() != null) {
      builder.header("If-None-Match", getDesignDocumentOptions.ifNoneMatch());
    }
    if (getDesignDocumentOptions.attachments() != null) {
      builder.query("attachments", String.valueOf(getDesignDocumentOptions.attachments()));
    }
    if (getDesignDocumentOptions.attEncodingInfo() != null) {
      builder.query("att_encoding_info", String.valueOf(getDesignDocumentOptions.attEncodingInfo()));
    }
    if (getDesignDocumentOptions.attsSince() != null) {
      builder.query("atts_since", RequestUtils.join(getDesignDocumentOptions.attsSince(), ","));
    }
    if (getDesignDocumentOptions.conflicts() != null) {
      builder.query("conflicts", String.valueOf(getDesignDocumentOptions.conflicts()));
    }
    if (getDesignDocumentOptions.deletedConflicts() != null) {
      builder.query("deleted_conflicts", String.valueOf(getDesignDocumentOptions.deletedConflicts()));
    }
    if (getDesignDocumentOptions.latest() != null) {
      builder.query("latest", String.valueOf(getDesignDocumentOptions.latest()));
    }
    if (getDesignDocumentOptions.localSeq() != null) {
      builder.query("local_seq", String.valueOf(getDesignDocumentOptions.localSeq()));
    }
    if (getDesignDocumentOptions.meta() != null) {
      builder.query("meta", String.valueOf(getDesignDocumentOptions.meta()));
    }
    if (getDesignDocumentOptions.openRevs() != null) {
      builder.query("open_revs", RequestUtils.join(getDesignDocumentOptions.openRevs(), ","));
    }
    if (getDesignDocumentOptions.rev() != null) {
      builder.query("rev", getDesignDocumentOptions.rev());
    }
    if (getDesignDocumentOptions.revs() != null) {
      builder.query("revs", String.valueOf(getDesignDocumentOptions.revs()));
    }
    if (getDesignDocumentOptions.revsInfo() != null) {
      builder.query("revs_info", String.valueOf(getDesignDocumentOptions.revsInfo()));
    }
    ResponseConverter<DesignDocument> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DesignDocument>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create or modify a design document.
   *
   * The PUT method creates a new named design document, or creates a new revision of the existing design document.
   *
   * @param putDesignDocumentOptions the {@link PutDesignDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DocumentResult}
   */
  public ServiceCall<DocumentResult> putDesignDocument(PutDesignDocumentOptions putDesignDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(putDesignDocumentOptions,
      "putDesignDocumentOptions cannot be null");
    String[] pathSegments = { "", "_design" };
    String[] pathParameters = { putDesignDocumentOptions.db(), putDesignDocumentOptions.ddoc() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "putDesignDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (putDesignDocumentOptions.ifMatch() != null) {
      builder.header("If-Match", putDesignDocumentOptions.ifMatch());
    }
    if (putDesignDocumentOptions.batch() != null) {
      builder.query("batch", putDesignDocumentOptions.batch());
    }
    if (putDesignDocumentOptions.newEdits() != null) {
      builder.query("new_edits", String.valueOf(putDesignDocumentOptions.newEdits()));
    }
    if (putDesignDocumentOptions.rev() != null) {
      builder.query("rev", putDesignDocumentOptions.rev());
    }
    if (putDesignDocumentOptions.designDocument() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(putDesignDocumentOptions.designDocument()), "application/json");
    }
    ResponseConverter<DocumentResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DocumentResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve information about a design document.
   *
   * Retrieves information about the specified design document, including the index, index size, and current status of
   * the design document and associated index information.
   *
   * @param getDesignDocumentInformationOptions the {@link GetDesignDocumentInformationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DesignDocumentInformation}
   */
  public ServiceCall<DesignDocumentInformation> getDesignDocumentInformation(GetDesignDocumentInformationOptions getDesignDocumentInformationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDesignDocumentInformationOptions,
      "getDesignDocumentInformationOptions cannot be null");
    String[] pathSegments = { "", "_design", "_info" };
    String[] pathParameters = { getDesignDocumentInformationOptions.db(), getDesignDocumentInformationOptions.ddoc() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getDesignDocumentInformation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DesignDocumentInformation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DesignDocumentInformation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a list of all design documents in a database.
   *
   * Queries the index of all design document IDs. The results matching the request body parameters are returned in a
   * JSON object, including a list of matching design documents with basic contents, such as the ID and revision. When
   * no request body parameters are specified, results for all design documents in the database are returned.
   * Optionally, the design document content or additional metadata can be included in the response.
   *
   * @param postDesignDocsOptions the {@link PostDesignDocsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AllDocsResult}
   */
  public ServiceCall<AllDocsResult> postDesignDocs(PostDesignDocsOptions postDesignDocsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postDesignDocsOptions,
      "postDesignDocsOptions cannot be null");
    String[] pathSegments = { "", "_design_docs" };
    String[] pathParameters = { postDesignDocsOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postDesignDocs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (postDesignDocsOptions.accept() != null) {
      builder.header("Accept", postDesignDocsOptions.accept());
    }
    final JsonObject contentJson = new JsonObject();
    if (postDesignDocsOptions.attEncodingInfo() != null) {
      contentJson.addProperty("att_encoding_info", postDesignDocsOptions.attEncodingInfo());
    }
    if (postDesignDocsOptions.attachments() != null) {
      contentJson.addProperty("attachments", postDesignDocsOptions.attachments());
    }
    if (postDesignDocsOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postDesignDocsOptions.conflicts());
    }
    if (postDesignDocsOptions.descending() != null) {
      contentJson.addProperty("descending", postDesignDocsOptions.descending());
    }
    if (postDesignDocsOptions.includeDocs() != null) {
      contentJson.addProperty("include_docs", postDesignDocsOptions.includeDocs());
    }
    if (postDesignDocsOptions.inclusiveEnd() != null) {
      contentJson.addProperty("inclusive_end", postDesignDocsOptions.inclusiveEnd());
    }
    if (postDesignDocsOptions.limit() != null) {
      contentJson.addProperty("limit", postDesignDocsOptions.limit());
    }
    if (postDesignDocsOptions.skip() != null) {
      contentJson.addProperty("skip", postDesignDocsOptions.skip());
    }
    if (postDesignDocsOptions.updateSeq() != null) {
      contentJson.addProperty("update_seq", postDesignDocsOptions.updateSeq());
    }
    if (postDesignDocsOptions.endkey() != null) {
      contentJson.addProperty("endkey", postDesignDocsOptions.endkey());
    }
    if (postDesignDocsOptions.key() != null) {
      contentJson.addProperty("key", postDesignDocsOptions.key());
    }
    if (postDesignDocsOptions.keys() != null) {
      contentJson.add("keys", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postDesignDocsOptions.keys()));
    }
    if (postDesignDocsOptions.startkey() != null) {
      contentJson.addProperty("startkey", postDesignDocsOptions.startkey());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AllDocsResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AllDocsResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Multi-query the list of all design documents.
   *
   * This operation runs multiple view queries of all design documents in the database. This operation enables you to
   * request numerous queries in a single request, in place of multiple POST `/{db}/_design_docs` requests.
   *
   * @param postDesignDocsQueriesOptions the {@link PostDesignDocsQueriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AllDocsQueriesResult}
   */
  public ServiceCall<AllDocsQueriesResult> postDesignDocsQueries(PostDesignDocsQueriesOptions postDesignDocsQueriesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postDesignDocsQueriesOptions,
      "postDesignDocsQueriesOptions cannot be null");
    String[] pathSegments = { "", "_design_docs/queries" };
    String[] pathParameters = { postDesignDocsQueriesOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postDesignDocsQueries");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (postDesignDocsQueriesOptions.accept() != null) {
      builder.header("Accept", postDesignDocsQueriesOptions.accept());
    }
    final JsonObject contentJson = new JsonObject();
    if (postDesignDocsQueriesOptions.queries() != null) {
      contentJson.add("queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postDesignDocsQueriesOptions.queries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AllDocsQueriesResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AllDocsQueriesResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a MapReduce view.
   *
   * This operation queries the specified MapReduce view of the specified design document. By default, the map and
   * reduce functions of the view are run to update the view before returning the response. The advantage of using the
   * HTTP `POST` method is that the query is submitted as a JSON object in the request body. This avoids the limitations
   * of passing query options as URL query parameters of a `GET` request.
   *
   * @param postViewOptions the {@link PostViewOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ViewResult}
   */
  public ServiceCall<ViewResult> postView(PostViewOptions postViewOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postViewOptions,
      "postViewOptions cannot be null");
    String[] pathSegments = { "", "_design", "_view" };
    String[] pathParameters = { postViewOptions.db(), postViewOptions.ddoc(), postViewOptions.view() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postView");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postViewOptions.attEncodingInfo() != null) {
      contentJson.addProperty("att_encoding_info", postViewOptions.attEncodingInfo());
    }
    if (postViewOptions.attachments() != null) {
      contentJson.addProperty("attachments", postViewOptions.attachments());
    }
    if (postViewOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postViewOptions.conflicts());
    }
    if (postViewOptions.descending() != null) {
      contentJson.addProperty("descending", postViewOptions.descending());
    }
    if (postViewOptions.includeDocs() != null) {
      contentJson.addProperty("include_docs", postViewOptions.includeDocs());
    }
    if (postViewOptions.inclusiveEnd() != null) {
      contentJson.addProperty("inclusive_end", postViewOptions.inclusiveEnd());
    }
    if (postViewOptions.limit() != null) {
      contentJson.addProperty("limit", postViewOptions.limit());
    }
    if (postViewOptions.skip() != null) {
      contentJson.addProperty("skip", postViewOptions.skip());
    }
    if (postViewOptions.updateSeq() != null) {
      contentJson.addProperty("update_seq", postViewOptions.updateSeq());
    }
    if (postViewOptions.endkey() != null) {
      contentJson.add("endkey", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postViewOptions.endkey()));
    }
    if (postViewOptions.endkeyDocid() != null) {
      contentJson.addProperty("endkey_docid", postViewOptions.endkeyDocid());
    }
    if (postViewOptions.group() != null) {
      contentJson.addProperty("group", postViewOptions.group());
    }
    if (postViewOptions.groupLevel() != null) {
      contentJson.addProperty("group_level", postViewOptions.groupLevel());
    }
    if (postViewOptions.key() != null) {
      contentJson.add("key", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postViewOptions.key()));
    }
    if (postViewOptions.keys() != null) {
      contentJson.add("keys", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postViewOptions.keys()));
    }
    if (postViewOptions.reduce() != null) {
      contentJson.addProperty("reduce", postViewOptions.reduce());
    }
    if (postViewOptions.stable() != null) {
      contentJson.addProperty("stable", postViewOptions.stable());
    }
    if (postViewOptions.startkey() != null) {
      contentJson.add("startkey", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postViewOptions.startkey()));
    }
    if (postViewOptions.startkeyDocid() != null) {
      contentJson.addProperty("startkey_docid", postViewOptions.startkeyDocid());
    }
    if (postViewOptions.update() != null) {
      contentJson.addProperty("update", postViewOptions.update());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ViewResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ViewResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a MapReduce view as stream.
   *
   * This operation queries the specified MapReduce view of the specified design document. By default, the map and
   * reduce functions of the view are run to update the view before returning the response. The advantage of using the
   * HTTP `POST` method is that the query is submitted as a JSON object in the request body. This avoids the limitations
   * of passing query options as URL query parameters of a `GET` request.
   *
   * @param postViewOptions the {@link PostViewOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postViewAsStream(PostViewOptions postViewOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postViewOptions,
      "postViewOptions cannot be null");
    String[] pathSegments = { "", "_design", "_view" };
    String[] pathParameters = { postViewOptions.db(), postViewOptions.ddoc(), postViewOptions.view() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postViewAsStream");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postViewOptions.attEncodingInfo() != null) {
      contentJson.addProperty("att_encoding_info", postViewOptions.attEncodingInfo());
    }
    if (postViewOptions.attachments() != null) {
      contentJson.addProperty("attachments", postViewOptions.attachments());
    }
    if (postViewOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postViewOptions.conflicts());
    }
    if (postViewOptions.descending() != null) {
      contentJson.addProperty("descending", postViewOptions.descending());
    }
    if (postViewOptions.includeDocs() != null) {
      contentJson.addProperty("include_docs", postViewOptions.includeDocs());
    }
    if (postViewOptions.inclusiveEnd() != null) {
      contentJson.addProperty("inclusive_end", postViewOptions.inclusiveEnd());
    }
    if (postViewOptions.limit() != null) {
      contentJson.addProperty("limit", postViewOptions.limit());
    }
    if (postViewOptions.skip() != null) {
      contentJson.addProperty("skip", postViewOptions.skip());
    }
    if (postViewOptions.updateSeq() != null) {
      contentJson.addProperty("update_seq", postViewOptions.updateSeq());
    }
    if (postViewOptions.endkey() != null) {
      contentJson.add("endkey", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postViewOptions.endkey()));
    }
    if (postViewOptions.endkeyDocid() != null) {
      contentJson.addProperty("endkey_docid", postViewOptions.endkeyDocid());
    }
    if (postViewOptions.group() != null) {
      contentJson.addProperty("group", postViewOptions.group());
    }
    if (postViewOptions.groupLevel() != null) {
      contentJson.addProperty("group_level", postViewOptions.groupLevel());
    }
    if (postViewOptions.key() != null) {
      contentJson.add("key", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postViewOptions.key()));
    }
    if (postViewOptions.keys() != null) {
      contentJson.add("keys", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postViewOptions.keys()));
    }
    if (postViewOptions.reduce() != null) {
      contentJson.addProperty("reduce", postViewOptions.reduce());
    }
    if (postViewOptions.stable() != null) {
      contentJson.addProperty("stable", postViewOptions.stable());
    }
    if (postViewOptions.startkey() != null) {
      contentJson.add("startkey", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postViewOptions.startkey()));
    }
    if (postViewOptions.startkeyDocid() != null) {
      contentJson.addProperty("startkey_docid", postViewOptions.startkeyDocid());
    }
    if (postViewOptions.update() != null) {
      contentJson.addProperty("update", postViewOptions.update());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Multi-query a MapReduce view.
   *
   * This operation runs multiple specified view queries against the view function from the specified design document.
   *
   * @param postViewQueriesOptions the {@link PostViewQueriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ViewQueriesResult}
   */
  public ServiceCall<ViewQueriesResult> postViewQueries(PostViewQueriesOptions postViewQueriesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postViewQueriesOptions,
      "postViewQueriesOptions cannot be null");
    String[] pathSegments = { "", "_design", "_view", "queries" };
    String[] pathParameters = { postViewQueriesOptions.db(), postViewQueriesOptions.ddoc(), postViewQueriesOptions.view() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postViewQueries");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postViewQueriesOptions.queries() != null) {
      contentJson.add("queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postViewQueriesOptions.queries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ViewQueriesResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ViewQueriesResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Multi-query a MapReduce view as stream.
   *
   * This operation runs multiple specified view queries against the view function from the specified design document.
   *
   * @param postViewQueriesOptions the {@link PostViewQueriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postViewQueriesAsStream(PostViewQueriesOptions postViewQueriesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postViewQueriesOptions,
      "postViewQueriesOptions cannot be null");
    String[] pathSegments = { "", "_design", "_view", "queries" };
    String[] pathParameters = { postViewQueriesOptions.db(), postViewQueriesOptions.ddoc(), postViewQueriesOptions.view() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postViewQueriesAsStream");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postViewQueriesOptions.queries() != null) {
      contentJson.add("queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postViewQueriesOptions.queries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve information about a database partition.
   *
   * Given a partition key, return the database name, sizes, partition, doc count, and doc delete count.
   *
   * @param getPartitionInformationOptions the {@link GetPartitionInformationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PartitionInformation}
   */
  public ServiceCall<PartitionInformation> getPartitionInformation(GetPartitionInformationOptions getPartitionInformationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPartitionInformationOptions,
      "getPartitionInformationOptions cannot be null");
    String[] pathSegments = { "", "_partition" };
    String[] pathParameters = { getPartitionInformationOptions.db(), getPartitionInformationOptions.partitionKey() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getPartitionInformation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<PartitionInformation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PartitionInformation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a list of all documents in a database partition.
   *
   * Queries the primary index (all document IDs). The results that match the query parameters are returned in a JSON
   * object, including a list of matching documents with basic contents, such as the ID and revision. When no query
   * parameters are specified, results for all documents in the database partition are returned. Optionally, document
   * content or additional metadata can be included in the response.
   *
   * @param postPartitionAllDocsOptions the {@link PostPartitionAllDocsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AllDocsResult}
   */
  public ServiceCall<AllDocsResult> postPartitionAllDocs(PostPartitionAllDocsOptions postPartitionAllDocsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postPartitionAllDocsOptions,
      "postPartitionAllDocsOptions cannot be null");
    String[] pathSegments = { "", "_partition", "_all_docs" };
    String[] pathParameters = { postPartitionAllDocsOptions.db(), postPartitionAllDocsOptions.partitionKey() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postPartitionAllDocs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postPartitionAllDocsOptions.attEncodingInfo() != null) {
      contentJson.addProperty("att_encoding_info", postPartitionAllDocsOptions.attEncodingInfo());
    }
    if (postPartitionAllDocsOptions.attachments() != null) {
      contentJson.addProperty("attachments", postPartitionAllDocsOptions.attachments());
    }
    if (postPartitionAllDocsOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postPartitionAllDocsOptions.conflicts());
    }
    if (postPartitionAllDocsOptions.descending() != null) {
      contentJson.addProperty("descending", postPartitionAllDocsOptions.descending());
    }
    if (postPartitionAllDocsOptions.includeDocs() != null) {
      contentJson.addProperty("include_docs", postPartitionAllDocsOptions.includeDocs());
    }
    if (postPartitionAllDocsOptions.inclusiveEnd() != null) {
      contentJson.addProperty("inclusive_end", postPartitionAllDocsOptions.inclusiveEnd());
    }
    if (postPartitionAllDocsOptions.limit() != null) {
      contentJson.addProperty("limit", postPartitionAllDocsOptions.limit());
    }
    if (postPartitionAllDocsOptions.skip() != null) {
      contentJson.addProperty("skip", postPartitionAllDocsOptions.skip());
    }
    if (postPartitionAllDocsOptions.updateSeq() != null) {
      contentJson.addProperty("update_seq", postPartitionAllDocsOptions.updateSeq());
    }
    if (postPartitionAllDocsOptions.endkey() != null) {
      contentJson.addProperty("endkey", postPartitionAllDocsOptions.endkey());
    }
    if (postPartitionAllDocsOptions.key() != null) {
      contentJson.addProperty("key", postPartitionAllDocsOptions.key());
    }
    if (postPartitionAllDocsOptions.keys() != null) {
      contentJson.add("keys", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionAllDocsOptions.keys()));
    }
    if (postPartitionAllDocsOptions.startkey() != null) {
      contentJson.addProperty("startkey", postPartitionAllDocsOptions.startkey());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AllDocsResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AllDocsResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a list of all documents in a database partition as stream.
   *
   * Queries the primary index (all document IDs). The results that match the query parameters are returned in a JSON
   * object, including a list of matching documents with basic contents, such as the ID and revision. When no query
   * parameters are specified, results for all documents in the database partition are returned. Optionally, document
   * content or additional metadata can be included in the response.
   *
   * @param postPartitionAllDocsOptions the {@link PostPartitionAllDocsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postPartitionAllDocsAsStream(PostPartitionAllDocsOptions postPartitionAllDocsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postPartitionAllDocsOptions,
      "postPartitionAllDocsOptions cannot be null");
    String[] pathSegments = { "", "_partition", "_all_docs" };
    String[] pathParameters = { postPartitionAllDocsOptions.db(), postPartitionAllDocsOptions.partitionKey() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postPartitionAllDocsAsStream");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postPartitionAllDocsOptions.attEncodingInfo() != null) {
      contentJson.addProperty("att_encoding_info", postPartitionAllDocsOptions.attEncodingInfo());
    }
    if (postPartitionAllDocsOptions.attachments() != null) {
      contentJson.addProperty("attachments", postPartitionAllDocsOptions.attachments());
    }
    if (postPartitionAllDocsOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postPartitionAllDocsOptions.conflicts());
    }
    if (postPartitionAllDocsOptions.descending() != null) {
      contentJson.addProperty("descending", postPartitionAllDocsOptions.descending());
    }
    if (postPartitionAllDocsOptions.includeDocs() != null) {
      contentJson.addProperty("include_docs", postPartitionAllDocsOptions.includeDocs());
    }
    if (postPartitionAllDocsOptions.inclusiveEnd() != null) {
      contentJson.addProperty("inclusive_end", postPartitionAllDocsOptions.inclusiveEnd());
    }
    if (postPartitionAllDocsOptions.limit() != null) {
      contentJson.addProperty("limit", postPartitionAllDocsOptions.limit());
    }
    if (postPartitionAllDocsOptions.skip() != null) {
      contentJson.addProperty("skip", postPartitionAllDocsOptions.skip());
    }
    if (postPartitionAllDocsOptions.updateSeq() != null) {
      contentJson.addProperty("update_seq", postPartitionAllDocsOptions.updateSeq());
    }
    if (postPartitionAllDocsOptions.endkey() != null) {
      contentJson.addProperty("endkey", postPartitionAllDocsOptions.endkey());
    }
    if (postPartitionAllDocsOptions.key() != null) {
      contentJson.addProperty("key", postPartitionAllDocsOptions.key());
    }
    if (postPartitionAllDocsOptions.keys() != null) {
      contentJson.add("keys", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionAllDocsOptions.keys()));
    }
    if (postPartitionAllDocsOptions.startkey() != null) {
      contentJson.addProperty("startkey", postPartitionAllDocsOptions.startkey());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a database partition search index.
   *
   * Partitioned Search indexes, which are defined in design documents, allow partition databases to be queried by using
   * Lucene Query Parser Syntax. Search indexes are defined by an index function, similar to a map function in MapReduce
   * views. The index function decides what data to index and store in the index.
   *
   * @param postPartitionSearchOptions the {@link PostPartitionSearchOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SearchResult}
   */
  public ServiceCall<SearchResult> postPartitionSearch(PostPartitionSearchOptions postPartitionSearchOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postPartitionSearchOptions,
      "postPartitionSearchOptions cannot be null");
    String[] pathSegments = { "", "_partition", "_design", "_search" };
    String[] pathParameters = { postPartitionSearchOptions.db(), postPartitionSearchOptions.partitionKey(), postPartitionSearchOptions.ddoc(), postPartitionSearchOptions.index() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postPartitionSearch");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postPartitionSearchOptions.bookmark() != null) {
      contentJson.addProperty("bookmark", postPartitionSearchOptions.bookmark());
    }
    if (postPartitionSearchOptions.highlightFields() != null) {
      contentJson.add("highlight_fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionSearchOptions.highlightFields()));
    }
    if (postPartitionSearchOptions.highlightNumber() != null) {
      contentJson.addProperty("highlight_number", postPartitionSearchOptions.highlightNumber());
    }
    if (postPartitionSearchOptions.highlightPostTag() != null) {
      contentJson.addProperty("highlight_post_tag", postPartitionSearchOptions.highlightPostTag());
    }
    if (postPartitionSearchOptions.highlightPreTag() != null) {
      contentJson.addProperty("highlight_pre_tag", postPartitionSearchOptions.highlightPreTag());
    }
    if (postPartitionSearchOptions.highlightSize() != null) {
      contentJson.addProperty("highlight_size", postPartitionSearchOptions.highlightSize());
    }
    if (postPartitionSearchOptions.includeDocs() != null) {
      contentJson.addProperty("include_docs", postPartitionSearchOptions.includeDocs());
    }
    if (postPartitionSearchOptions.includeFields() != null) {
      contentJson.add("include_fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionSearchOptions.includeFields()));
    }
    if (postPartitionSearchOptions.limit() != null) {
      contentJson.addProperty("limit", postPartitionSearchOptions.limit());
    }
    if (postPartitionSearchOptions.query() != null) {
      contentJson.addProperty("query", postPartitionSearchOptions.query());
    }
    if (postPartitionSearchOptions.sort() != null) {
      contentJson.add("sort", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionSearchOptions.sort()));
    }
    if (postPartitionSearchOptions.stale() != null) {
      contentJson.addProperty("stale", postPartitionSearchOptions.stale());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SearchResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SearchResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a database partition search index as stream.
   *
   * Partitioned Search indexes, which are defined in design documents, allow partition databases to be queried by using
   * Lucene Query Parser Syntax. Search indexes are defined by an index function, similar to a map function in MapReduce
   * views. The index function decides what data to index and store in the index.
   *
   * @param postPartitionSearchOptions the {@link PostPartitionSearchOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postPartitionSearchAsStream(PostPartitionSearchOptions postPartitionSearchOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postPartitionSearchOptions,
      "postPartitionSearchOptions cannot be null");
    String[] pathSegments = { "", "_partition", "_design", "_search" };
    String[] pathParameters = { postPartitionSearchOptions.db(), postPartitionSearchOptions.partitionKey(), postPartitionSearchOptions.ddoc(), postPartitionSearchOptions.index() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postPartitionSearchAsStream");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postPartitionSearchOptions.bookmark() != null) {
      contentJson.addProperty("bookmark", postPartitionSearchOptions.bookmark());
    }
    if (postPartitionSearchOptions.highlightFields() != null) {
      contentJson.add("highlight_fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionSearchOptions.highlightFields()));
    }
    if (postPartitionSearchOptions.highlightNumber() != null) {
      contentJson.addProperty("highlight_number", postPartitionSearchOptions.highlightNumber());
    }
    if (postPartitionSearchOptions.highlightPostTag() != null) {
      contentJson.addProperty("highlight_post_tag", postPartitionSearchOptions.highlightPostTag());
    }
    if (postPartitionSearchOptions.highlightPreTag() != null) {
      contentJson.addProperty("highlight_pre_tag", postPartitionSearchOptions.highlightPreTag());
    }
    if (postPartitionSearchOptions.highlightSize() != null) {
      contentJson.addProperty("highlight_size", postPartitionSearchOptions.highlightSize());
    }
    if (postPartitionSearchOptions.includeDocs() != null) {
      contentJson.addProperty("include_docs", postPartitionSearchOptions.includeDocs());
    }
    if (postPartitionSearchOptions.includeFields() != null) {
      contentJson.add("include_fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionSearchOptions.includeFields()));
    }
    if (postPartitionSearchOptions.limit() != null) {
      contentJson.addProperty("limit", postPartitionSearchOptions.limit());
    }
    if (postPartitionSearchOptions.query() != null) {
      contentJson.addProperty("query", postPartitionSearchOptions.query());
    }
    if (postPartitionSearchOptions.sort() != null) {
      contentJson.add("sort", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionSearchOptions.sort()));
    }
    if (postPartitionSearchOptions.stale() != null) {
      contentJson.addProperty("stale", postPartitionSearchOptions.stale());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a database partition MapReduce view function.
   *
   * Runs the specified view function from the specified design document. Unlike `GET /{db}/_design/{ddoc}/_view/{view}`
   * for accessing views, the POST method supports the specification of explicit keys to be retrieved from the view
   * results. The remainder of the POST view functionality is identical to the `GET /{db}/_design/{ddoc}/_view/{view}`
   * API.
   *
   * @param postPartitionViewOptions the {@link PostPartitionViewOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ViewResult}
   */
  public ServiceCall<ViewResult> postPartitionView(PostPartitionViewOptions postPartitionViewOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postPartitionViewOptions,
      "postPartitionViewOptions cannot be null");
    String[] pathSegments = { "", "_partition", "_design", "_view" };
    String[] pathParameters = { postPartitionViewOptions.db(), postPartitionViewOptions.partitionKey(), postPartitionViewOptions.ddoc(), postPartitionViewOptions.view() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postPartitionView");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postPartitionViewOptions.attEncodingInfo() != null) {
      contentJson.addProperty("att_encoding_info", postPartitionViewOptions.attEncodingInfo());
    }
    if (postPartitionViewOptions.attachments() != null) {
      contentJson.addProperty("attachments", postPartitionViewOptions.attachments());
    }
    if (postPartitionViewOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postPartitionViewOptions.conflicts());
    }
    if (postPartitionViewOptions.descending() != null) {
      contentJson.addProperty("descending", postPartitionViewOptions.descending());
    }
    if (postPartitionViewOptions.includeDocs() != null) {
      contentJson.addProperty("include_docs", postPartitionViewOptions.includeDocs());
    }
    if (postPartitionViewOptions.inclusiveEnd() != null) {
      contentJson.addProperty("inclusive_end", postPartitionViewOptions.inclusiveEnd());
    }
    if (postPartitionViewOptions.limit() != null) {
      contentJson.addProperty("limit", postPartitionViewOptions.limit());
    }
    if (postPartitionViewOptions.skip() != null) {
      contentJson.addProperty("skip", postPartitionViewOptions.skip());
    }
    if (postPartitionViewOptions.updateSeq() != null) {
      contentJson.addProperty("update_seq", postPartitionViewOptions.updateSeq());
    }
    if (postPartitionViewOptions.endkey() != null) {
      contentJson.add("endkey", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionViewOptions.endkey()));
    }
    if (postPartitionViewOptions.endkeyDocid() != null) {
      contentJson.addProperty("endkey_docid", postPartitionViewOptions.endkeyDocid());
    }
    if (postPartitionViewOptions.group() != null) {
      contentJson.addProperty("group", postPartitionViewOptions.group());
    }
    if (postPartitionViewOptions.groupLevel() != null) {
      contentJson.addProperty("group_level", postPartitionViewOptions.groupLevel());
    }
    if (postPartitionViewOptions.key() != null) {
      contentJson.add("key", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionViewOptions.key()));
    }
    if (postPartitionViewOptions.keys() != null) {
      contentJson.add("keys", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionViewOptions.keys()));
    }
    if (postPartitionViewOptions.reduce() != null) {
      contentJson.addProperty("reduce", postPartitionViewOptions.reduce());
    }
    if (postPartitionViewOptions.stable() != null) {
      contentJson.addProperty("stable", postPartitionViewOptions.stable());
    }
    if (postPartitionViewOptions.startkey() != null) {
      contentJson.add("startkey", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionViewOptions.startkey()));
    }
    if (postPartitionViewOptions.startkeyDocid() != null) {
      contentJson.addProperty("startkey_docid", postPartitionViewOptions.startkeyDocid());
    }
    if (postPartitionViewOptions.update() != null) {
      contentJson.addProperty("update", postPartitionViewOptions.update());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ViewResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ViewResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a database partition MapReduce view function as stream.
   *
   * Runs the specified view function from the specified design document. Unlike `GET /{db}/_design/{ddoc}/_view/{view}`
   * for accessing views, the POST method supports the specification of explicit keys to be retrieved from the view
   * results. The remainder of the POST view functionality is identical to the `GET /{db}/_design/{ddoc}/_view/{view}`
   * API.
   *
   * @param postPartitionViewOptions the {@link PostPartitionViewOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postPartitionViewAsStream(PostPartitionViewOptions postPartitionViewOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postPartitionViewOptions,
      "postPartitionViewOptions cannot be null");
    String[] pathSegments = { "", "_partition", "_design", "_view" };
    String[] pathParameters = { postPartitionViewOptions.db(), postPartitionViewOptions.partitionKey(), postPartitionViewOptions.ddoc(), postPartitionViewOptions.view() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postPartitionViewAsStream");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postPartitionViewOptions.attEncodingInfo() != null) {
      contentJson.addProperty("att_encoding_info", postPartitionViewOptions.attEncodingInfo());
    }
    if (postPartitionViewOptions.attachments() != null) {
      contentJson.addProperty("attachments", postPartitionViewOptions.attachments());
    }
    if (postPartitionViewOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postPartitionViewOptions.conflicts());
    }
    if (postPartitionViewOptions.descending() != null) {
      contentJson.addProperty("descending", postPartitionViewOptions.descending());
    }
    if (postPartitionViewOptions.includeDocs() != null) {
      contentJson.addProperty("include_docs", postPartitionViewOptions.includeDocs());
    }
    if (postPartitionViewOptions.inclusiveEnd() != null) {
      contentJson.addProperty("inclusive_end", postPartitionViewOptions.inclusiveEnd());
    }
    if (postPartitionViewOptions.limit() != null) {
      contentJson.addProperty("limit", postPartitionViewOptions.limit());
    }
    if (postPartitionViewOptions.skip() != null) {
      contentJson.addProperty("skip", postPartitionViewOptions.skip());
    }
    if (postPartitionViewOptions.updateSeq() != null) {
      contentJson.addProperty("update_seq", postPartitionViewOptions.updateSeq());
    }
    if (postPartitionViewOptions.endkey() != null) {
      contentJson.add("endkey", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionViewOptions.endkey()));
    }
    if (postPartitionViewOptions.endkeyDocid() != null) {
      contentJson.addProperty("endkey_docid", postPartitionViewOptions.endkeyDocid());
    }
    if (postPartitionViewOptions.group() != null) {
      contentJson.addProperty("group", postPartitionViewOptions.group());
    }
    if (postPartitionViewOptions.groupLevel() != null) {
      contentJson.addProperty("group_level", postPartitionViewOptions.groupLevel());
    }
    if (postPartitionViewOptions.key() != null) {
      contentJson.add("key", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionViewOptions.key()));
    }
    if (postPartitionViewOptions.keys() != null) {
      contentJson.add("keys", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionViewOptions.keys()));
    }
    if (postPartitionViewOptions.reduce() != null) {
      contentJson.addProperty("reduce", postPartitionViewOptions.reduce());
    }
    if (postPartitionViewOptions.stable() != null) {
      contentJson.addProperty("stable", postPartitionViewOptions.stable());
    }
    if (postPartitionViewOptions.startkey() != null) {
      contentJson.add("startkey", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionViewOptions.startkey()));
    }
    if (postPartitionViewOptions.startkeyDocid() != null) {
      contentJson.addProperty("startkey_docid", postPartitionViewOptions.startkeyDocid());
    }
    if (postPartitionViewOptions.update() != null) {
      contentJson.addProperty("update", postPartitionViewOptions.update());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a database partition index by using selector syntax (POST).
   *
   * Query documents by using a declarative JSON querying syntax. Queries can use the built-in `_all_docs` index or
   * custom indices, specified by using the `_index` endpoint.
   *
   * @param postPartitionFindOptions the {@link PostPartitionFindOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FindResult}
   */
  public ServiceCall<FindResult> postPartitionFind(PostPartitionFindOptions postPartitionFindOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postPartitionFindOptions,
      "postPartitionFindOptions cannot be null");
    String[] pathSegments = { "", "_partition", "_find" };
    String[] pathParameters = { postPartitionFindOptions.db(), postPartitionFindOptions.partitionKey() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postPartitionFind");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postPartitionFindOptions.bookmark() != null) {
      contentJson.addProperty("bookmark", postPartitionFindOptions.bookmark());
    }
    if (postPartitionFindOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postPartitionFindOptions.conflicts());
    }
    if (postPartitionFindOptions.executionStats() != null) {
      contentJson.addProperty("execution_stats", postPartitionFindOptions.executionStats());
    }
    if (postPartitionFindOptions.fields() != null) {
      contentJson.add("fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionFindOptions.fields()));
    }
    if (postPartitionFindOptions.limit() != null) {
      contentJson.addProperty("limit", postPartitionFindOptions.limit());
    }
    if (postPartitionFindOptions.selector() != null) {
      contentJson.add("selector", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionFindOptions.selector()));
    }
    if (postPartitionFindOptions.skip() != null) {
      contentJson.addProperty("skip", postPartitionFindOptions.skip());
    }
    if (postPartitionFindOptions.sort() != null) {
      contentJson.add("sort", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionFindOptions.sort()));
    }
    if (postPartitionFindOptions.stable() != null) {
      contentJson.addProperty("stable", postPartitionFindOptions.stable());
    }
    if (postPartitionFindOptions.update() != null) {
      contentJson.addProperty("update", postPartitionFindOptions.update());
    }
    if (postPartitionFindOptions.useIndex() != null) {
      contentJson.add("use_index", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionFindOptions.useIndex()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<FindResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FindResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a database partition index by using selector syntax (POST) as stream.
   *
   * Query documents by using a declarative JSON querying syntax. Queries can use the built-in `_all_docs` index or
   * custom indices, specified by using the `_index` endpoint.
   *
   * @param postPartitionFindOptions the {@link PostPartitionFindOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postPartitionFindAsStream(PostPartitionFindOptions postPartitionFindOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postPartitionFindOptions,
      "postPartitionFindOptions cannot be null");
    String[] pathSegments = { "", "_partition", "_find" };
    String[] pathParameters = { postPartitionFindOptions.db(), postPartitionFindOptions.partitionKey() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postPartitionFindAsStream");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postPartitionFindOptions.bookmark() != null) {
      contentJson.addProperty("bookmark", postPartitionFindOptions.bookmark());
    }
    if (postPartitionFindOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postPartitionFindOptions.conflicts());
    }
    if (postPartitionFindOptions.executionStats() != null) {
      contentJson.addProperty("execution_stats", postPartitionFindOptions.executionStats());
    }
    if (postPartitionFindOptions.fields() != null) {
      contentJson.add("fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionFindOptions.fields()));
    }
    if (postPartitionFindOptions.limit() != null) {
      contentJson.addProperty("limit", postPartitionFindOptions.limit());
    }
    if (postPartitionFindOptions.selector() != null) {
      contentJson.add("selector", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionFindOptions.selector()));
    }
    if (postPartitionFindOptions.skip() != null) {
      contentJson.addProperty("skip", postPartitionFindOptions.skip());
    }
    if (postPartitionFindOptions.sort() != null) {
      contentJson.add("sort", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionFindOptions.sort()));
    }
    if (postPartitionFindOptions.stable() != null) {
      contentJson.addProperty("stable", postPartitionFindOptions.stable());
    }
    if (postPartitionFindOptions.update() != null) {
      contentJson.addProperty("update", postPartitionFindOptions.update());
    }
    if (postPartitionFindOptions.useIndex() != null) {
      contentJson.add("use_index", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postPartitionFindOptions.useIndex()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve information about which index is used for a query.
   *
   * Shows which index is being used by the query. Parameters are the same as the [`_find`
   * endpoint](#query-an-index-by-using-selector-syntax.
   *
   * @param postExplainOptions the {@link PostExplainOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ExplainResult}
   */
  public ServiceCall<ExplainResult> postExplain(PostExplainOptions postExplainOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postExplainOptions,
      "postExplainOptions cannot be null");
    String[] pathSegments = { "", "_explain" };
    String[] pathParameters = { postExplainOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postExplain");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postExplainOptions.bookmark() != null) {
      contentJson.addProperty("bookmark", postExplainOptions.bookmark());
    }
    if (postExplainOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postExplainOptions.conflicts());
    }
    if (postExplainOptions.executionStats() != null) {
      contentJson.addProperty("execution_stats", postExplainOptions.executionStats());
    }
    if (postExplainOptions.fields() != null) {
      contentJson.add("fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postExplainOptions.fields()));
    }
    if (postExplainOptions.limit() != null) {
      contentJson.addProperty("limit", postExplainOptions.limit());
    }
    if (postExplainOptions.selector() != null) {
      contentJson.add("selector", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postExplainOptions.selector()));
    }
    if (postExplainOptions.skip() != null) {
      contentJson.addProperty("skip", postExplainOptions.skip());
    }
    if (postExplainOptions.sort() != null) {
      contentJson.add("sort", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postExplainOptions.sort()));
    }
    if (postExplainOptions.stable() != null) {
      contentJson.addProperty("stable", postExplainOptions.stable());
    }
    if (postExplainOptions.update() != null) {
      contentJson.addProperty("update", postExplainOptions.update());
    }
    if (postExplainOptions.useIndex() != null) {
      contentJson.add("use_index", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postExplainOptions.useIndex()));
    }
    if (postExplainOptions.r() != null) {
      contentJson.addProperty("r", postExplainOptions.r());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ExplainResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ExplainResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query an index by using selector syntax.
   *
   * Query documents by using a declarative JSON querying syntax. Queries can use the built-in `_all_docs` index or
   * custom indices, specified by using the `_index` endpoint.
   *
   * @param postFindOptions the {@link PostFindOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FindResult}
   */
  public ServiceCall<FindResult> postFind(PostFindOptions postFindOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postFindOptions,
      "postFindOptions cannot be null");
    String[] pathSegments = { "", "_find" };
    String[] pathParameters = { postFindOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postFind");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postFindOptions.bookmark() != null) {
      contentJson.addProperty("bookmark", postFindOptions.bookmark());
    }
    if (postFindOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postFindOptions.conflicts());
    }
    if (postFindOptions.executionStats() != null) {
      contentJson.addProperty("execution_stats", postFindOptions.executionStats());
    }
    if (postFindOptions.fields() != null) {
      contentJson.add("fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postFindOptions.fields()));
    }
    if (postFindOptions.limit() != null) {
      contentJson.addProperty("limit", postFindOptions.limit());
    }
    if (postFindOptions.selector() != null) {
      contentJson.add("selector", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postFindOptions.selector()));
    }
    if (postFindOptions.skip() != null) {
      contentJson.addProperty("skip", postFindOptions.skip());
    }
    if (postFindOptions.sort() != null) {
      contentJson.add("sort", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postFindOptions.sort()));
    }
    if (postFindOptions.stable() != null) {
      contentJson.addProperty("stable", postFindOptions.stable());
    }
    if (postFindOptions.update() != null) {
      contentJson.addProperty("update", postFindOptions.update());
    }
    if (postFindOptions.useIndex() != null) {
      contentJson.add("use_index", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postFindOptions.useIndex()));
    }
    if (postFindOptions.r() != null) {
      contentJson.addProperty("r", postFindOptions.r());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<FindResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FindResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query an index by using selector syntax as stream.
   *
   * Query documents by using a declarative JSON querying syntax. Queries can use the built-in `_all_docs` index or
   * custom indices, specified by using the `_index` endpoint.
   *
   * @param postFindOptions the {@link PostFindOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postFindAsStream(PostFindOptions postFindOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postFindOptions,
      "postFindOptions cannot be null");
    String[] pathSegments = { "", "_find" };
    String[] pathParameters = { postFindOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postFindAsStream");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postFindOptions.bookmark() != null) {
      contentJson.addProperty("bookmark", postFindOptions.bookmark());
    }
    if (postFindOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postFindOptions.conflicts());
    }
    if (postFindOptions.executionStats() != null) {
      contentJson.addProperty("execution_stats", postFindOptions.executionStats());
    }
    if (postFindOptions.fields() != null) {
      contentJson.add("fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postFindOptions.fields()));
    }
    if (postFindOptions.limit() != null) {
      contentJson.addProperty("limit", postFindOptions.limit());
    }
    if (postFindOptions.selector() != null) {
      contentJson.add("selector", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postFindOptions.selector()));
    }
    if (postFindOptions.skip() != null) {
      contentJson.addProperty("skip", postFindOptions.skip());
    }
    if (postFindOptions.sort() != null) {
      contentJson.add("sort", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postFindOptions.sort()));
    }
    if (postFindOptions.stable() != null) {
      contentJson.addProperty("stable", postFindOptions.stable());
    }
    if (postFindOptions.update() != null) {
      contentJson.addProperty("update", postFindOptions.update());
    }
    if (postFindOptions.useIndex() != null) {
      contentJson.add("use_index", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postFindOptions.useIndex()));
    }
    if (postFindOptions.r() != null) {
      contentJson.addProperty("r", postFindOptions.r());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve information about all indexes.
   *
   * When you make a GET request to `/db/_index`, you get a list of all indexes used by Cloudant Query in the database,
   * including the primary index. In addition to the information available through this API, indexes are also stored in
   * the `indexes` property of design documents.
   *
   * @param getIndexesInformationOptions the {@link GetIndexesInformationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IndexesInformation}
   */
  public ServiceCall<IndexesInformation> getIndexesInformation(GetIndexesInformationOptions getIndexesInformationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getIndexesInformationOptions,
      "getIndexesInformationOptions cannot be null");
    String[] pathSegments = { "", "_index" };
    String[] pathParameters = { getIndexesInformationOptions.db() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getIndexesInformation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<IndexesInformation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IndexesInformation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new index on a database.
   *
   * Create a new index on a database.
   *
   * @param postIndexOptions the {@link PostIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IndexResult}
   */
  public ServiceCall<IndexResult> postIndex(PostIndexOptions postIndexOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postIndexOptions,
      "postIndexOptions cannot be null");
    String[] pathSegments = { "", "_index" };
    String[] pathParameters = { postIndexOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postIndexOptions.ddoc() != null) {
      contentJson.addProperty("ddoc", postIndexOptions.ddoc());
    }
    if (postIndexOptions.def() != null) {
      contentJson.add("def", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postIndexOptions.def()));
    }
    if (postIndexOptions.index() != null) {
      contentJson.add("index", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postIndexOptions.index()));
    }
    if (postIndexOptions.name() != null) {
      contentJson.addProperty("name", postIndexOptions.name());
    }
    if (postIndexOptions.partialFilterSelector() != null) {
      contentJson.add("partial_filter_selector", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postIndexOptions.partialFilterSelector()));
    }
    if (postIndexOptions.partitioned() != null) {
      contentJson.addProperty("partitioned", postIndexOptions.partitioned());
    }
    if (postIndexOptions.type() != null) {
      contentJson.addProperty("type", postIndexOptions.type());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<IndexResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IndexResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an index.
   *
   * @param deleteIndexOptions the {@link DeleteIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Ok}
   */
  public ServiceCall<Ok> deleteIndex(DeleteIndexOptions deleteIndexOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteIndexOptions,
      "deleteIndexOptions cannot be null");
    String[] pathSegments = { "", "_index/_design", "", "" };
    String[] pathParameters = { deleteIndexOptions.db(), deleteIndexOptions.ddoc(), deleteIndexOptions.type(), deleteIndexOptions.index() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "deleteIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Ok> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Ok>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query tokenization of sample text.
   *
   * Returns the results of analyzer tokenization of the provided sample text. This endpoint can be used for testing
   * analyzer tokenization.
   *
   * @param postSearchAnalyzeOptions the {@link PostSearchAnalyzeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SearchAnalyzeResult}
   */
  public ServiceCall<SearchAnalyzeResult> postSearchAnalyze(PostSearchAnalyzeOptions postSearchAnalyzeOptions) {
    boolean skipBody = false;
    if (postSearchAnalyzeOptions == null) {
      postSearchAnalyzeOptions = new PostSearchAnalyzeOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "_search_analyze" };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postSearchAnalyze");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (postSearchAnalyzeOptions.analyzer() != null) {
        contentJson.addProperty("analyzer", postSearchAnalyzeOptions.analyzer());
      }
      if (postSearchAnalyzeOptions.text() != null) {
        contentJson.addProperty("text", postSearchAnalyzeOptions.text());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<SearchAnalyzeResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SearchAnalyzeResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query tokenization of sample text.
   *
   * Returns the results of analyzer tokenization of the provided sample text. This endpoint can be used for testing
   * analyzer tokenization.
   *
   * @return a {@link ServiceCall} with a result of type {@link SearchAnalyzeResult}
   */
  public ServiceCall<SearchAnalyzeResult> postSearchAnalyze() {
    return postSearchAnalyze(null);
  }

  /**
   * Query a search index.
   *
   * Search indexes, which are defined in design documents, allow databases to be queried by using Lucene Query Parser
   * Syntax. An index function defines a search index, similar to a map function in MapReduce views. The index function
   * decides what data to index and what data to store in the index. The advantage of using the HTTP `POST` method is
   * that the query is submitted as a JSON object in the request body. This avoids the limitations of passing query
   * options as URL query parameters of a `GET` request.
   *
   * @param postSearchOptions the {@link PostSearchOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SearchResult}
   */
  public ServiceCall<SearchResult> postSearch(PostSearchOptions postSearchOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postSearchOptions,
      "postSearchOptions cannot be null");
    String[] pathSegments = { "", "_design", "_search" };
    String[] pathParameters = { postSearchOptions.db(), postSearchOptions.ddoc(), postSearchOptions.index() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postSearch");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postSearchOptions.bookmark() != null) {
      contentJson.addProperty("bookmark", postSearchOptions.bookmark());
    }
    if (postSearchOptions.highlightFields() != null) {
      contentJson.add("highlight_fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postSearchOptions.highlightFields()));
    }
    if (postSearchOptions.highlightNumber() != null) {
      contentJson.addProperty("highlight_number", postSearchOptions.highlightNumber());
    }
    if (postSearchOptions.highlightPostTag() != null) {
      contentJson.addProperty("highlight_post_tag", postSearchOptions.highlightPostTag());
    }
    if (postSearchOptions.highlightPreTag() != null) {
      contentJson.addProperty("highlight_pre_tag", postSearchOptions.highlightPreTag());
    }
    if (postSearchOptions.highlightSize() != null) {
      contentJson.addProperty("highlight_size", postSearchOptions.highlightSize());
    }
    if (postSearchOptions.includeDocs() != null) {
      contentJson.addProperty("include_docs", postSearchOptions.includeDocs());
    }
    if (postSearchOptions.includeFields() != null) {
      contentJson.add("include_fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postSearchOptions.includeFields()));
    }
    if (postSearchOptions.limit() != null) {
      contentJson.addProperty("limit", postSearchOptions.limit());
    }
    if (postSearchOptions.query() != null) {
      contentJson.addProperty("query", postSearchOptions.query());
    }
    if (postSearchOptions.sort() != null) {
      contentJson.add("sort", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postSearchOptions.sort()));
    }
    if (postSearchOptions.stale() != null) {
      contentJson.addProperty("stale", postSearchOptions.stale());
    }
    if (postSearchOptions.counts() != null) {
      contentJson.add("counts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postSearchOptions.counts()));
    }
    if (postSearchOptions.drilldown() != null) {
      contentJson.add("drilldown", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postSearchOptions.drilldown()));
    }
    if (postSearchOptions.groupField() != null) {
      contentJson.addProperty("group_field", postSearchOptions.groupField());
    }
    if (postSearchOptions.groupLimit() != null) {
      contentJson.addProperty("group_limit", postSearchOptions.groupLimit());
    }
    if (postSearchOptions.groupSort() != null) {
      contentJson.add("group_sort", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postSearchOptions.groupSort()));
    }
    if (postSearchOptions.ranges() != null) {
      contentJson.add("ranges", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postSearchOptions.ranges()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SearchResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SearchResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a search index as stream.
   *
   * Search indexes, which are defined in design documents, allow databases to be queried by using Lucene Query Parser
   * Syntax. An index function defines a search index, similar to a map function in MapReduce views. The index function
   * decides what data to index and what data to store in the index. The advantage of using the HTTP `POST` method is
   * that the query is submitted as a JSON object in the request body. This avoids the limitations of passing query
   * options as URL query parameters of a `GET` request.
   *
   * @param postSearchOptions the {@link PostSearchOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postSearchAsStream(PostSearchOptions postSearchOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postSearchOptions,
      "postSearchOptions cannot be null");
    String[] pathSegments = { "", "_design", "_search" };
    String[] pathParameters = { postSearchOptions.db(), postSearchOptions.ddoc(), postSearchOptions.index() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postSearchAsStream");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (postSearchOptions.bookmark() != null) {
      contentJson.addProperty("bookmark", postSearchOptions.bookmark());
    }
    if (postSearchOptions.highlightFields() != null) {
      contentJson.add("highlight_fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postSearchOptions.highlightFields()));
    }
    if (postSearchOptions.highlightNumber() != null) {
      contentJson.addProperty("highlight_number", postSearchOptions.highlightNumber());
    }
    if (postSearchOptions.highlightPostTag() != null) {
      contentJson.addProperty("highlight_post_tag", postSearchOptions.highlightPostTag());
    }
    if (postSearchOptions.highlightPreTag() != null) {
      contentJson.addProperty("highlight_pre_tag", postSearchOptions.highlightPreTag());
    }
    if (postSearchOptions.highlightSize() != null) {
      contentJson.addProperty("highlight_size", postSearchOptions.highlightSize());
    }
    if (postSearchOptions.includeDocs() != null) {
      contentJson.addProperty("include_docs", postSearchOptions.includeDocs());
    }
    if (postSearchOptions.includeFields() != null) {
      contentJson.add("include_fields", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postSearchOptions.includeFields()));
    }
    if (postSearchOptions.limit() != null) {
      contentJson.addProperty("limit", postSearchOptions.limit());
    }
    if (postSearchOptions.query() != null) {
      contentJson.addProperty("query", postSearchOptions.query());
    }
    if (postSearchOptions.sort() != null) {
      contentJson.add("sort", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postSearchOptions.sort()));
    }
    if (postSearchOptions.stale() != null) {
      contentJson.addProperty("stale", postSearchOptions.stale());
    }
    if (postSearchOptions.counts() != null) {
      contentJson.add("counts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postSearchOptions.counts()));
    }
    if (postSearchOptions.drilldown() != null) {
      contentJson.add("drilldown", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postSearchOptions.drilldown()));
    }
    if (postSearchOptions.groupField() != null) {
      contentJson.addProperty("group_field", postSearchOptions.groupField());
    }
    if (postSearchOptions.groupLimit() != null) {
      contentJson.addProperty("group_limit", postSearchOptions.groupLimit());
    }
    if (postSearchOptions.groupSort() != null) {
      contentJson.add("group_sort", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postSearchOptions.groupSort()));
    }
    if (postSearchOptions.ranges() != null) {
      contentJson.add("ranges", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postSearchOptions.ranges()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve information about a search index.
   *
   * Retrieve search index metadata information, such as the size of the index on disk.
   *
   * @param getSearchInfoOptions the {@link GetSearchInfoOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SearchInfoResult}
   */
  public ServiceCall<SearchInfoResult> getSearchInfo(GetSearchInfoOptions getSearchInfoOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSearchInfoOptions,
      "getSearchInfoOptions cannot be null");
    String[] pathSegments = { "", "_design", "_search_info" };
    String[] pathParameters = { getSearchInfoOptions.db(), getSearchInfoOptions.ddoc(), getSearchInfoOptions.index() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getSearchInfo");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SearchInfoResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SearchInfoResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a geospatial index.
   *
   * Executes a query against the requested geospatial index from the specified design document.
   *
   * @param getGeoOptions the {@link GetGeoOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GeoResult}
   */
  public ServiceCall<GeoResult> getGeo(GetGeoOptions getGeoOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getGeoOptions,
      "getGeoOptions cannot be null");
    String[] pathSegments = { "", "_design", "_geo" };
    String[] pathParameters = { getGeoOptions.db(), getGeoOptions.ddoc(), getGeoOptions.index() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getGeo");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getGeoOptions.bbox() != null) {
      builder.query("bbox", getGeoOptions.bbox());
    }
    if (getGeoOptions.bookmark() != null) {
      builder.query("bookmark", getGeoOptions.bookmark());
    }
    if (getGeoOptions.format() != null) {
      builder.query("format", getGeoOptions.format());
    }
    if (getGeoOptions.g() != null) {
      builder.query("g", getGeoOptions.g());
    }
    if (getGeoOptions.includeDocs() != null) {
      builder.query("include_docs", String.valueOf(getGeoOptions.includeDocs()));
    }
    if (getGeoOptions.lat() != null) {
      builder.query("lat", String.valueOf(getGeoOptions.lat()));
    }
    if (getGeoOptions.limit() != null) {
      builder.query("limit", String.valueOf(getGeoOptions.limit()));
    }
    if (getGeoOptions.lon() != null) {
      builder.query("lon", String.valueOf(getGeoOptions.lon()));
    }
    if (getGeoOptions.nearest() != null) {
      builder.query("nearest", String.valueOf(getGeoOptions.nearest()));
    }
    if (getGeoOptions.radius() != null) {
      builder.query("radius", String.valueOf(getGeoOptions.radius()));
    }
    if (getGeoOptions.rangex() != null) {
      builder.query("rangex", String.valueOf(getGeoOptions.rangex()));
    }
    if (getGeoOptions.rangey() != null) {
      builder.query("rangey", String.valueOf(getGeoOptions.rangey()));
    }
    if (getGeoOptions.relation() != null) {
      builder.query("relation", getGeoOptions.relation());
    }
    if (getGeoOptions.skip() != null) {
      builder.query("skip", String.valueOf(getGeoOptions.skip()));
    }
    if (getGeoOptions.stale() != null) {
      builder.query("stale", getGeoOptions.stale());
    }
    ResponseConverter<GeoResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GeoResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a geospatial index as stream.
   *
   * Executes a query against the requested geospatial index from the specified design document.
   *
   * @param getGeoOptions the {@link GetGeoOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getGeoAsStream(GetGeoOptions getGeoOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getGeoOptions,
      "getGeoOptions cannot be null");
    String[] pathSegments = { "", "_design", "_geo" };
    String[] pathParameters = { getGeoOptions.db(), getGeoOptions.ddoc(), getGeoOptions.index() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getGeoAsStream");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getGeoOptions.bbox() != null) {
      builder.query("bbox", getGeoOptions.bbox());
    }
    if (getGeoOptions.bookmark() != null) {
      builder.query("bookmark", getGeoOptions.bookmark());
    }
    if (getGeoOptions.format() != null) {
      builder.query("format", getGeoOptions.format());
    }
    if (getGeoOptions.g() != null) {
      builder.query("g", getGeoOptions.g());
    }
    if (getGeoOptions.includeDocs() != null) {
      builder.query("include_docs", String.valueOf(getGeoOptions.includeDocs()));
    }
    if (getGeoOptions.lat() != null) {
      builder.query("lat", String.valueOf(getGeoOptions.lat()));
    }
    if (getGeoOptions.limit() != null) {
      builder.query("limit", String.valueOf(getGeoOptions.limit()));
    }
    if (getGeoOptions.lon() != null) {
      builder.query("lon", String.valueOf(getGeoOptions.lon()));
    }
    if (getGeoOptions.nearest() != null) {
      builder.query("nearest", String.valueOf(getGeoOptions.nearest()));
    }
    if (getGeoOptions.radius() != null) {
      builder.query("radius", String.valueOf(getGeoOptions.radius()));
    }
    if (getGeoOptions.rangex() != null) {
      builder.query("rangex", String.valueOf(getGeoOptions.rangex()));
    }
    if (getGeoOptions.rangey() != null) {
      builder.query("rangey", String.valueOf(getGeoOptions.rangey()));
    }
    if (getGeoOptions.relation() != null) {
      builder.query("relation", getGeoOptions.relation());
    }
    if (getGeoOptions.skip() != null) {
      builder.query("skip", String.valueOf(getGeoOptions.skip()));
    }
    if (getGeoOptions.stale() != null) {
      builder.query("stale", getGeoOptions.stale());
    }
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Cleanup old geospatial indexes.
   *
   * Cleanup old geospatial indexes from disk that have been superseded by newer index builds.
   *
   * @param postGeoCleanupOptions the {@link PostGeoCleanupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Ok}
   */
  public ServiceCall<Ok> postGeoCleanup(PostGeoCleanupOptions postGeoCleanupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postGeoCleanupOptions,
      "postGeoCleanupOptions cannot be null");
    String[] pathSegments = { "", "_geo_cleanup" };
    String[] pathParameters = { postGeoCleanupOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postGeoCleanup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Ok> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Ok>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve information about a geospatial index.
   *
   * @param getGeoIndexInformationOptions the {@link GetGeoIndexInformationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GeoIndexInformation}
   */
  public ServiceCall<GeoIndexInformation> getGeoIndexInformation(GetGeoIndexInformationOptions getGeoIndexInformationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getGeoIndexInformationOptions,
      "getGeoIndexInformationOptions cannot be null");
    String[] pathSegments = { "", "_design", "_geo_info" };
    String[] pathParameters = { getGeoIndexInformationOptions.db(), getGeoIndexInformationOptions.ddoc(), getGeoIndexInformationOptions.index() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getGeoIndexInformation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<GeoIndexInformation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GeoIndexInformation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve change events for all databases.
   *
   * Lists changes to databases, like a global changes feed. Types of changes include updating the database and creating
   * or deleting a database. Like the changes feed, the feed is not guaranteed to return changes in the correct order
   * and might repeat changes. Polling modes for this method work like polling modes for the changes feed.
   * **Note: This endpoint requires _admin or _db_updates role and is only available on dedicated clusters.**.
   *
   * @param getDbUpdatesOptions the {@link GetDbUpdatesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DbUpdates}
   */
  public ServiceCall<DbUpdates> getDbUpdates(GetDbUpdatesOptions getDbUpdatesOptions) {
    if (getDbUpdatesOptions == null) {
      getDbUpdatesOptions = new GetDbUpdatesOptions.Builder().build();
    }
    String[] pathSegments = { "_db_updates" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getDbUpdates");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getDbUpdatesOptions.feed() != null) {
      builder.query("feed", getDbUpdatesOptions.feed());
    }
    if (getDbUpdatesOptions.heartbeat() != null) {
      builder.query("heartbeat", String.valueOf(getDbUpdatesOptions.heartbeat()));
    }
    if (getDbUpdatesOptions.timeout() != null) {
      builder.query("timeout", String.valueOf(getDbUpdatesOptions.timeout()));
    }
    if (getDbUpdatesOptions.since() != null) {
      builder.query("since", getDbUpdatesOptions.since());
    }
    ResponseConverter<DbUpdates> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DbUpdates>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve change events for all databases.
   *
   * Lists changes to databases, like a global changes feed. Types of changes include updating the database and creating
   * or deleting a database. Like the changes feed, the feed is not guaranteed to return changes in the correct order
   * and might repeat changes. Polling modes for this method work like polling modes for the changes feed.
   * **Note: This endpoint requires _admin or _db_updates role and is only available on dedicated clusters.**.
   *
   * @return a {@link ServiceCall} with a result of type {@link DbUpdates}
   */
  public ServiceCall<DbUpdates> getDbUpdates() {
    return getDbUpdates(null);
  }

  /**
   * Retrieve the HTTP headers for a replication document.
   *
   * Retrieves the HTTP headers for a replication document from the `_replicator` database.
   *
   * @param headReplicationDocumentOptions the {@link HeadReplicationDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> headReplicationDocument(HeadReplicationDocumentOptions headReplicationDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(headReplicationDocumentOptions,
      "headReplicationDocumentOptions cannot be null");
    String[] pathSegments = { "_replicator" };
    String[] pathParameters = { headReplicationDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.head(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "headReplicationDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (headReplicationDocumentOptions.ifNoneMatch() != null) {
      builder.header("If-None-Match", headReplicationDocumentOptions.ifNoneMatch());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the HTTP headers for a replication scheduler job.
   *
   * Returns the HTTP headers that contain a minimal amount of information about the specified replication task. Only
   * the header information is returned.
   *
   * @param headSchedulerJobOptions the {@link HeadSchedulerJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> headSchedulerJob(HeadSchedulerJobOptions headSchedulerJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(headSchedulerJobOptions,
      "headSchedulerJobOptions cannot be null");
    String[] pathSegments = { "_scheduler/jobs" };
    String[] pathParameters = { headSchedulerJobOptions.jobId() };
    RequestBuilder builder = RequestBuilder.head(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "headSchedulerJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create or modify a replication operation.
   *
   * Requests, configures, or stops a replicate operation.
   *
   * @param postReplicateOptions the {@link PostReplicateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReplicationResult}
   */
  public ServiceCall<ReplicationResult> postReplicate(PostReplicateOptions postReplicateOptions) {
    if (postReplicateOptions == null) {
      postReplicateOptions = new PostReplicateOptions.Builder().build();
    }
    String[] pathSegments = { "_replicate" };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postReplicate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (postReplicateOptions.replicationDocument() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(postReplicateOptions.replicationDocument()), "application/json");
    }
    ResponseConverter<ReplicationResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReplicationResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create or modify a replication operation.
   *
   * Requests, configures, or stops a replicate operation.
   *
   * @return a {@link ServiceCall} with a result of type {@link ReplicationResult}
   */
  public ServiceCall<ReplicationResult> postReplicate() {
    return postReplicate(null);
  }

  /**
   * Cancel a replication.
   *
   * Cancels a replication by deleting the document that describes it from the `_replicator` database.
   *
   * @param deleteReplicationDocumentOptions the {@link DeleteReplicationDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DocumentResult}
   */
  public ServiceCall<DocumentResult> deleteReplicationDocument(DeleteReplicationDocumentOptions deleteReplicationDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteReplicationDocumentOptions,
      "deleteReplicationDocumentOptions cannot be null");
    String[] pathSegments = { "_replicator" };
    String[] pathParameters = { deleteReplicationDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "deleteReplicationDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteReplicationDocumentOptions.ifMatch() != null) {
      builder.header("If-Match", deleteReplicationDocumentOptions.ifMatch());
    }
    if (deleteReplicationDocumentOptions.batch() != null) {
      builder.query("batch", deleteReplicationDocumentOptions.batch());
    }
    if (deleteReplicationDocumentOptions.rev() != null) {
      builder.query("rev", deleteReplicationDocumentOptions.rev());
    }
    ResponseConverter<DocumentResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DocumentResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a replication document.
   *
   * Retrieves a replication document from the `_replicator` database to view the configuration of the replication. The
   * status of the replication is no longer recorded in the document but can be checked via the replication scheduler.
   *
   * @param getReplicationDocumentOptions the {@link GetReplicationDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReplicationDocument}
   */
  public ServiceCall<ReplicationDocument> getReplicationDocument(GetReplicationDocumentOptions getReplicationDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getReplicationDocumentOptions,
      "getReplicationDocumentOptions cannot be null");
    String[] pathSegments = { "_replicator" };
    String[] pathParameters = { getReplicationDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getReplicationDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getReplicationDocumentOptions.ifNoneMatch() != null) {
      builder.header("If-None-Match", getReplicationDocumentOptions.ifNoneMatch());
    }
    if (getReplicationDocumentOptions.attachments() != null) {
      builder.query("attachments", String.valueOf(getReplicationDocumentOptions.attachments()));
    }
    if (getReplicationDocumentOptions.attEncodingInfo() != null) {
      builder.query("att_encoding_info", String.valueOf(getReplicationDocumentOptions.attEncodingInfo()));
    }
    if (getReplicationDocumentOptions.attsSince() != null) {
      builder.query("atts_since", RequestUtils.join(getReplicationDocumentOptions.attsSince(), ","));
    }
    if (getReplicationDocumentOptions.conflicts() != null) {
      builder.query("conflicts", String.valueOf(getReplicationDocumentOptions.conflicts()));
    }
    if (getReplicationDocumentOptions.deletedConflicts() != null) {
      builder.query("deleted_conflicts", String.valueOf(getReplicationDocumentOptions.deletedConflicts()));
    }
    if (getReplicationDocumentOptions.latest() != null) {
      builder.query("latest", String.valueOf(getReplicationDocumentOptions.latest()));
    }
    if (getReplicationDocumentOptions.localSeq() != null) {
      builder.query("local_seq", String.valueOf(getReplicationDocumentOptions.localSeq()));
    }
    if (getReplicationDocumentOptions.meta() != null) {
      builder.query("meta", String.valueOf(getReplicationDocumentOptions.meta()));
    }
    if (getReplicationDocumentOptions.openRevs() != null) {
      builder.query("open_revs", RequestUtils.join(getReplicationDocumentOptions.openRevs(), ","));
    }
    if (getReplicationDocumentOptions.rev() != null) {
      builder.query("rev", getReplicationDocumentOptions.rev());
    }
    if (getReplicationDocumentOptions.revs() != null) {
      builder.query("revs", String.valueOf(getReplicationDocumentOptions.revs()));
    }
    if (getReplicationDocumentOptions.revsInfo() != null) {
      builder.query("revs_info", String.valueOf(getReplicationDocumentOptions.revsInfo()));
    }
    ResponseConverter<ReplicationDocument> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReplicationDocument>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Start or update a replication.
   *
   * Creates or modifies a document in the `_replicator` database to start a new replication or to edit an existing
   * replication.
   *
   * @param putReplicationDocumentOptions the {@link PutReplicationDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DocumentResult}
   */
  public ServiceCall<DocumentResult> putReplicationDocument(PutReplicationDocumentOptions putReplicationDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(putReplicationDocumentOptions,
      "putReplicationDocumentOptions cannot be null");
    String[] pathSegments = { "_replicator" };
    String[] pathParameters = { putReplicationDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "putReplicationDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (putReplicationDocumentOptions.ifMatch() != null) {
      builder.header("If-Match", putReplicationDocumentOptions.ifMatch());
    }
    if (putReplicationDocumentOptions.batch() != null) {
      builder.query("batch", putReplicationDocumentOptions.batch());
    }
    if (putReplicationDocumentOptions.newEdits() != null) {
      builder.query("new_edits", String.valueOf(putReplicationDocumentOptions.newEdits()));
    }
    if (putReplicationDocumentOptions.rev() != null) {
      builder.query("rev", putReplicationDocumentOptions.rev());
    }
    if (putReplicationDocumentOptions.replicationDocument() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(putReplicationDocumentOptions.replicationDocument()), "application/json");
    }
    ResponseConverter<DocumentResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DocumentResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve replication scheduler documents.
   *
   * Lists replication documents, including information about all documents, even the ones in a completed or failed
   * state. For each document, the endpoint returns the document ID, database, replication ID, source and target, and
   * other information.
   *
   * @param getSchedulerDocsOptions the {@link GetSchedulerDocsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SchedulerDocsResult}
   */
  public ServiceCall<SchedulerDocsResult> getSchedulerDocs(GetSchedulerDocsOptions getSchedulerDocsOptions) {
    if (getSchedulerDocsOptions == null) {
      getSchedulerDocsOptions = new GetSchedulerDocsOptions.Builder().build();
    }
    String[] pathSegments = { "_scheduler/docs" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getSchedulerDocs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSchedulerDocsOptions.limit() != null) {
      builder.query("limit", String.valueOf(getSchedulerDocsOptions.limit()));
    }
    if (getSchedulerDocsOptions.skip() != null) {
      builder.query("skip", String.valueOf(getSchedulerDocsOptions.skip()));
    }
    if (getSchedulerDocsOptions.states() != null) {
      builder.query("states", RequestUtils.join(getSchedulerDocsOptions.states(), ","));
    }
    ResponseConverter<SchedulerDocsResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SchedulerDocsResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve replication scheduler documents.
   *
   * Lists replication documents, including information about all documents, even the ones in a completed or failed
   * state. For each document, the endpoint returns the document ID, database, replication ID, source and target, and
   * other information.
   *
   * @return a {@link ServiceCall} with a result of type {@link SchedulerDocsResult}
   */
  public ServiceCall<SchedulerDocsResult> getSchedulerDocs() {
    return getSchedulerDocs(null);
  }

  /**
   * Retrieve a replication scheduler document.
   *
   * Retrieves information about a replication document from the replicator database. The endpoint returns the document
   * ID, database, replication ID, source and target, and other information.
   *
   * @param getSchedulerDocumentOptions the {@link GetSchedulerDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SchedulerDocument}
   */
  public ServiceCall<SchedulerDocument> getSchedulerDocument(GetSchedulerDocumentOptions getSchedulerDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSchedulerDocumentOptions,
      "getSchedulerDocumentOptions cannot be null");
    String[] pathSegments = { "_scheduler/docs/_replicator" };
    String[] pathParameters = { getSchedulerDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getSchedulerDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SchedulerDocument> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SchedulerDocument>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve replication scheduler jobs.
   *
   * Retrieves information about replications that were created via `/_replicate` endpoint, as well as those created
   * from replication documents. It doesn't include replications that completed or failed to start because replication
   * documents were malformed. Each job description includes source and target information, replication ID, history of
   * recent events, and other information.
   *
   * @param getSchedulerJobsOptions the {@link GetSchedulerJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SchedulerJobsResult}
   */
  public ServiceCall<SchedulerJobsResult> getSchedulerJobs(GetSchedulerJobsOptions getSchedulerJobsOptions) {
    if (getSchedulerJobsOptions == null) {
      getSchedulerJobsOptions = new GetSchedulerJobsOptions.Builder().build();
    }
    String[] pathSegments = { "_scheduler/jobs" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getSchedulerJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSchedulerJobsOptions.limit() != null) {
      builder.query("limit", String.valueOf(getSchedulerJobsOptions.limit()));
    }
    if (getSchedulerJobsOptions.skip() != null) {
      builder.query("skip", String.valueOf(getSchedulerJobsOptions.skip()));
    }
    ResponseConverter<SchedulerJobsResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SchedulerJobsResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve replication scheduler jobs.
   *
   * Retrieves information about replications that were created via `/_replicate` endpoint, as well as those created
   * from replication documents. It doesn't include replications that completed or failed to start because replication
   * documents were malformed. Each job description includes source and target information, replication ID, history of
   * recent events, and other information.
   *
   * @return a {@link ServiceCall} with a result of type {@link SchedulerJobsResult}
   */
  public ServiceCall<SchedulerJobsResult> getSchedulerJobs() {
    return getSchedulerJobs(null);
  }

  /**
   * Retrieve a replication scheduler job.
   *
   * Retrieves the state of a single replication task based on its replication ID.
   *
   * @param getSchedulerJobOptions the {@link GetSchedulerJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SchedulerJob}
   */
  public ServiceCall<SchedulerJob> getSchedulerJob(GetSchedulerJobOptions getSchedulerJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSchedulerJobOptions,
      "getSchedulerJobOptions cannot be null");
    String[] pathSegments = { "_scheduler/jobs" };
    String[] pathParameters = { getSchedulerJobOptions.jobId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getSchedulerJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SchedulerJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SchedulerJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve current session cookie information.
   *
   * Retrieves information about the authenticated user's session.
   *
   * @param getSessionInformationOptions the {@link GetSessionInformationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SessionInformation}
   */
  public ServiceCall<SessionInformation> getSessionInformation(GetSessionInformationOptions getSessionInformationOptions) {
    String[] pathSegments = { "_session" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getSessionInformation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SessionInformation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SessionInformation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve current session cookie information.
   *
   * Retrieves information about the authenticated user's session.
   *
   * @return a {@link ServiceCall} with a result of type {@link SessionInformation}
   */
  public ServiceCall<SessionInformation> getSessionInformation() {
    return getSessionInformation(null);
  }

  /**
   * Delete an IAM cookie session.
   *
   * Returns a response that instructs the HTTP client to clear the cookie. The session cookies are stateless and cannot
   * be invalidated; hence, this operation is optional and does not invalidate the cookie on the server.
   *
   * @param deleteIamSessionOptions the {@link DeleteIamSessionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Ok}
   */
  public ServiceCall<Ok> deleteIamSession(DeleteIamSessionOptions deleteIamSessionOptions) {
    String[] pathSegments = { "_iam_session" };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "deleteIamSession");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Ok> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Ok>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an IAM cookie session.
   *
   * Returns a response that instructs the HTTP client to clear the cookie. The session cookies are stateless and cannot
   * be invalidated; hence, this operation is optional and does not invalidate the cookie on the server.
   *
   * @return a {@link ServiceCall} with a result of type {@link Ok}
   */
  public ServiceCall<Ok> deleteIamSession() {
    return deleteIamSession(null);
  }

  /**
   * Retrieve current IAM cookie session information.
   *
   * Retrieves information about an IAM cookie session.
   *
   * @param getIamSessionInformationOptions the {@link GetIamSessionInformationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IamSessionInformation}
   */
  public ServiceCall<IamSessionInformation> getIamSessionInformation(GetIamSessionInformationOptions getIamSessionInformationOptions) {
    String[] pathSegments = { "_iam_session" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getIamSessionInformation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<IamSessionInformation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IamSessionInformation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve current IAM cookie session information.
   *
   * Retrieves information about an IAM cookie session.
   *
   * @return a {@link ServiceCall} with a result of type {@link IamSessionInformation}
   */
  public ServiceCall<IamSessionInformation> getIamSessionInformation() {
    return getIamSessionInformation(null);
  }

  /**
   * Create a session cookie by using an IAM token.
   *
   * Log in by exchanging an IAM token for an IBM Cloudant cookie.
   *
   * @param postIamSessionOptions the {@link PostIamSessionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Ok}
   */
  public ServiceCall<Ok> postIamSession(PostIamSessionOptions postIamSessionOptions) {
    boolean skipBody = false;
    if (postIamSessionOptions == null) {
      postIamSessionOptions = new PostIamSessionOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "_iam_session" };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postIamSession");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (postIamSessionOptions.accessToken() != null) {
        contentJson.addProperty("access_token", postIamSessionOptions.accessToken());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<Ok> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Ok>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a session cookie by using an IAM token.
   *
   * Log in by exchanging an IAM token for an IBM Cloudant cookie.
   *
   * @return a {@link ServiceCall} with a result of type {@link Ok}
   */
  public ServiceCall<Ok> postIamSession() {
    return postIamSession(null);
  }

  /**
   * Retrieve database permissions information.
   *
   * See who has permission to read, write, and manage the database. The credentials you use to log in to the dashboard
   * automatically include `_admin` permissions to all databases you create. Everyone and everything else, including
   * users you share databases with and API keys you create, must be given a permission level explicitly.
   *
   * @param getSecurityOptions the {@link GetSecurityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Security}
   */
  public ServiceCall<Security> getSecurity(GetSecurityOptions getSecurityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSecurityOptions,
      "getSecurityOptions cannot be null");
    String[] pathSegments = { "", "_security" };
    String[] pathParameters = { getSecurityOptions.db() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getSecurity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Security> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Security>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Modify database permissions.
   *
   * Modify who has permission to read, write, or manage a database. This endpoint can be used to modify both Cloudant
   * and CouchDB related permissions. Be careful: by removing a Cloudant API key, a member or an admin from the list of
   * users that have access permissions, you remove it from the list of users that have access to the database.
   *
   * @param putSecurityOptions the {@link PutSecurityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Ok}
   */
  public ServiceCall<Ok> putSecurity(PutSecurityOptions putSecurityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(putSecurityOptions,
      "putSecurityOptions cannot be null");
    String[] pathSegments = { "", "_security" };
    String[] pathParameters = { putSecurityOptions.db() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "putSecurity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (putSecurityOptions.admins() != null) {
      contentJson.add("admins", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putSecurityOptions.admins()));
    }
    if (putSecurityOptions.members() != null) {
      contentJson.add("members", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putSecurityOptions.members()));
    }
    if (putSecurityOptions.cloudant() != null) {
      contentJson.add("cloudant", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putSecurityOptions.cloudant()));
    }
    if (putSecurityOptions.couchdbAuthOnly() != null) {
      contentJson.addProperty("couchdb_auth_only", putSecurityOptions.couchdbAuthOnly());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Ok> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Ok>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Generates API keys for apps or persons to enable database access.
   *
   * Generates API keys to enable database access for a person or application, but without creating a new IBM Cloudant
   * account for that person or application. An API key is a randomly generated username and password. The key is given
   * the wanted access permissions for a database.
   *
   * @param postApiKeysOptions the {@link PostApiKeysOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ApiKeysResult}
   */
  public ServiceCall<ApiKeysResult> postApiKeys(PostApiKeysOptions postApiKeysOptions) {
    String[] pathSegments = { "_api/v2/api_keys" };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postApiKeys");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ApiKeysResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ApiKeysResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Generates API keys for apps or persons to enable database access.
   *
   * Generates API keys to enable database access for a person or application, but without creating a new IBM Cloudant
   * account for that person or application. An API key is a randomly generated username and password. The key is given
   * the wanted access permissions for a database.
   *
   * @return a {@link ServiceCall} with a result of type {@link ApiKeysResult}
   */
  public ServiceCall<ApiKeysResult> postApiKeys() {
    return postApiKeys(null);
  }

  /**
   * Modify only Cloudant related database permissions.
   *
   * Modify only Cloudant related permissions to database. Be careful: by removing an API key from the list, you remove
   * the API key from the list of users that have access to the database.
   *
   * @param putCloudantSecurityConfigurationOptions the {@link PutCloudantSecurityConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Ok}
   */
  public ServiceCall<Ok> putCloudantSecurityConfiguration(PutCloudantSecurityConfigurationOptions putCloudantSecurityConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(putCloudantSecurityConfigurationOptions,
      "putCloudantSecurityConfigurationOptions cannot be null");
    String[] pathSegments = { "_api/v2/db", "_security" };
    String[] pathParameters = { putCloudantSecurityConfigurationOptions.db() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "putCloudantSecurityConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (putCloudantSecurityConfigurationOptions.admins() != null) {
      contentJson.add("admins", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putCloudantSecurityConfigurationOptions.admins()));
    }
    if (putCloudantSecurityConfigurationOptions.members() != null) {
      contentJson.add("members", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putCloudantSecurityConfigurationOptions.members()));
    }
    if (putCloudantSecurityConfigurationOptions.cloudant() != null) {
      contentJson.add("cloudant", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putCloudantSecurityConfigurationOptions.cloudant()));
    }
    if (putCloudantSecurityConfigurationOptions.couchdbAuthOnly() != null) {
      contentJson.addProperty("couchdb_auth_only", putCloudantSecurityConfigurationOptions.couchdbAuthOnly());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Ok> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Ok>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve CORS configuration information.
   *
   * Lists all Cross-origin resource sharing (CORS) configuration. CORS defines a way in which the browser and the
   * server interact to determine whether or not to allow the request.
   *
   * @param getCorsInformationOptions the {@link GetCorsInformationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CorsConfiguration}
   */
  public ServiceCall<CorsConfiguration> getCorsInformation(GetCorsInformationOptions getCorsInformationOptions) {
    String[] pathSegments = { "_api/v2/user/config/cors" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getCorsInformation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CorsConfiguration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CorsConfiguration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve CORS configuration information.
   *
   * Lists all Cross-origin resource sharing (CORS) configuration. CORS defines a way in which the browser and the
   * server interact to determine whether or not to allow the request.
   *
   * @return a {@link ServiceCall} with a result of type {@link CorsConfiguration}
   */
  public ServiceCall<CorsConfiguration> getCorsInformation() {
    return getCorsInformation(null);
  }

  /**
   * Modify CORS configuration.
   *
   * Sets the CORS configuration. The configuration applies to all databases and all account level endpoints in your
   * account.
   *
   * @param putCorsConfigurationOptions the {@link PutCorsConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Ok}
   */
  public ServiceCall<Ok> putCorsConfiguration(PutCorsConfigurationOptions putCorsConfigurationOptions) {
    boolean skipBody = false;
    if (putCorsConfigurationOptions == null) {
      putCorsConfigurationOptions = new PutCorsConfigurationOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "_api/v2/user/config/cors" };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "putCorsConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (putCorsConfigurationOptions.allowCredentials() != null) {
        contentJson.addProperty("allow_credentials", putCorsConfigurationOptions.allowCredentials());
      }
      if (putCorsConfigurationOptions.enableCors() != null) {
        contentJson.addProperty("enable_cors", putCorsConfigurationOptions.enableCors());
      }
      if (putCorsConfigurationOptions.origins() != null) {
        contentJson.add("origins", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putCorsConfigurationOptions.origins()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<Ok> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Ok>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Modify CORS configuration.
   *
   * Sets the CORS configuration. The configuration applies to all databases and all account level endpoints in your
   * account.
   *
   * @return a {@link ServiceCall} with a result of type {@link Ok}
   */
  public ServiceCall<Ok> putCorsConfiguration() {
    return putCorsConfiguration(null);
  }

  /**
   * Retrieve the HTTP headers for an attachment.
   *
   * Returns the HTTP headers that contain a minimal amount of information about the specified attachment. This method
   * supports the same query arguments as the `GET /{db}/{doc_id}/{attachment_name}` method, but only the header
   * information (including attachment size, encoding, and the MD5 hash as an ETag), is returned.
   *
   * @param headAttachmentOptions the {@link HeadAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> headAttachment(HeadAttachmentOptions headAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(headAttachmentOptions,
      "headAttachmentOptions cannot be null");
    String[] pathSegments = { "", "", "" };
    String[] pathParameters = { headAttachmentOptions.db(), headAttachmentOptions.docId(), headAttachmentOptions.attachmentName() };
    RequestBuilder builder = RequestBuilder.head(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "headAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (headAttachmentOptions.ifMatch() != null) {
      builder.header("If-Match", headAttachmentOptions.ifMatch());
    }
    if (headAttachmentOptions.ifNoneMatch() != null) {
      builder.header("If-None-Match", headAttachmentOptions.ifNoneMatch());
    }
    if (headAttachmentOptions.rev() != null) {
      builder.query("rev", headAttachmentOptions.rev());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an attachment.
   *
   * Deletes the attachment with the filename, `{attachment_name}`, from the specified doc. You must supply the `rev`
   * query parameter or `If-Match` header with the current revision to delete the attachment.
   *
   * @param deleteAttachmentOptions the {@link DeleteAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DocumentResult}
   */
  public ServiceCall<DocumentResult> deleteAttachment(DeleteAttachmentOptions deleteAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteAttachmentOptions,
      "deleteAttachmentOptions cannot be null");
    String[] pathSegments = { "", "", "" };
    String[] pathParameters = { deleteAttachmentOptions.db(), deleteAttachmentOptions.docId(), deleteAttachmentOptions.attachmentName() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "deleteAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteAttachmentOptions.ifMatch() != null) {
      builder.header("If-Match", deleteAttachmentOptions.ifMatch());
    }
    if (deleteAttachmentOptions.rev() != null) {
      builder.query("rev", deleteAttachmentOptions.rev());
    }
    if (deleteAttachmentOptions.batch() != null) {
      builder.query("batch", deleteAttachmentOptions.batch());
    }
    ResponseConverter<DocumentResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DocumentResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an attachment.
   *
   * Returns the file attachment that is associated with the document. The raw data of the associated attachment is
   * returned, just as if you were accessing a static file. The returned Content-Type header is the same as the content
   * type set when the document attachment was submitted to the database.
   *
   * @param getAttachmentOptions the {@link GetAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getAttachment(GetAttachmentOptions getAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAttachmentOptions,
      "getAttachmentOptions cannot be null");
    String[] pathSegments = { "", "", "" };
    String[] pathParameters = { getAttachmentOptions.db(), getAttachmentOptions.docId(), getAttachmentOptions.attachmentName() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getAttachmentOptions.accept() != null) {
      builder.header("Accept", getAttachmentOptions.accept());
    }
    if (getAttachmentOptions.ifMatch() != null) {
      builder.header("If-Match", getAttachmentOptions.ifMatch());
    }
    if (getAttachmentOptions.ifNoneMatch() != null) {
      builder.header("If-None-Match", getAttachmentOptions.ifNoneMatch());
    }
    if (getAttachmentOptions.range() != null) {
      builder.header("Range", getAttachmentOptions.range());
    }
    if (getAttachmentOptions.rev() != null) {
      builder.query("rev", getAttachmentOptions.rev());
    }
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create or modify an attachment.
   *
   * Uploads the supplied content as an attachment to the specified document. The attachment name that you provide must
   * be a URL encoded string. You must supply the Content-Type header, and for an existing document, you must also
   * supply either the `rev` query argument or the `If-Match` HTTP header. If you omit the revision, a new, otherwise
   * empty, document is created with the provided attachment, or a conflict occurs. If the uploaded attachment uses an
   * existing attachment name in the remote database, it updates the corresponding stored content of the database. Since
   * you must supply the revision information to add an attachment to the document, this serves as validation to update
   * the existing attachment.
   *
   * @param putAttachmentOptions the {@link PutAttachmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DocumentResult}
   */
  public ServiceCall<DocumentResult> putAttachment(PutAttachmentOptions putAttachmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(putAttachmentOptions,
      "putAttachmentOptions cannot be null");
    String[] pathSegments = { "", "", "" };
    String[] pathParameters = { putAttachmentOptions.db(), putAttachmentOptions.docId(), putAttachmentOptions.attachmentName() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "putAttachment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("Content-Type", putAttachmentOptions.contentType());
    if (putAttachmentOptions.ifMatch() != null) {
      builder.header("If-Match", putAttachmentOptions.ifMatch());
    }
    if (putAttachmentOptions.rev() != null) {
      builder.query("rev", putAttachmentOptions.rev());
    }
    builder.bodyContent(putAttachmentOptions.contentType(), null,
      null, putAttachmentOptions.attachment());
    ResponseConverter<DocumentResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DocumentResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a local document.
   *
   * Deletes the specified local document. The semantics are identical to deleting a standard document in the specified
   * database, except that the document is not replicated.
   *
   * @param deleteLocalDocumentOptions the {@link DeleteLocalDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DocumentResult}
   */
  public ServiceCall<DocumentResult> deleteLocalDocument(DeleteLocalDocumentOptions deleteLocalDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteLocalDocumentOptions,
      "deleteLocalDocumentOptions cannot be null");
    String[] pathSegments = { "", "_local" };
    String[] pathParameters = { deleteLocalDocumentOptions.db(), deleteLocalDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "deleteLocalDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteLocalDocumentOptions.batch() != null) {
      builder.query("batch", deleteLocalDocumentOptions.batch());
    }
    ResponseConverter<DocumentResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DocumentResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a local document.
   *
   * Retrieves the specified local document. The semantics are identical to accessing a standard document in the
   * specified database, except that the document is not replicated.
   *
   * @param getLocalDocumentOptions the {@link GetLocalDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Document}
   */
  public ServiceCall<Document> getLocalDocument(GetLocalDocumentOptions getLocalDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLocalDocumentOptions,
      "getLocalDocumentOptions cannot be null");
    String[] pathSegments = { "", "_local" };
    String[] pathParameters = { getLocalDocumentOptions.db(), getLocalDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getLocalDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getLocalDocumentOptions.accept() != null) {
      builder.header("Accept", getLocalDocumentOptions.accept());
    }
    if (getLocalDocumentOptions.ifNoneMatch() != null) {
      builder.header("If-None-Match", getLocalDocumentOptions.ifNoneMatch());
    }
    if (getLocalDocumentOptions.attachments() != null) {
      builder.query("attachments", String.valueOf(getLocalDocumentOptions.attachments()));
    }
    if (getLocalDocumentOptions.attEncodingInfo() != null) {
      builder.query("att_encoding_info", String.valueOf(getLocalDocumentOptions.attEncodingInfo()));
    }
    if (getLocalDocumentOptions.attsSince() != null) {
      builder.query("atts_since", RequestUtils.join(getLocalDocumentOptions.attsSince(), ","));
    }
    if (getLocalDocumentOptions.localSeq() != null) {
      builder.query("local_seq", String.valueOf(getLocalDocumentOptions.localSeq()));
    }
    ResponseConverter<Document> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Document>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create or modify a local document.
   *
   * Stores the specified local document. The semantics are identical to storing a standard document in the specified
   * database, except that the document is not replicated.
   *
   * @param putLocalDocumentOptions the {@link PutLocalDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DocumentResult}
   */
  public ServiceCall<DocumentResult> putLocalDocument(PutLocalDocumentOptions putLocalDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(putLocalDocumentOptions,
      "putLocalDocumentOptions cannot be null");
    String[] pathSegments = { "", "_local" };
    String[] pathParameters = { putLocalDocumentOptions.db(), putLocalDocumentOptions.docId() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "putLocalDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (putLocalDocumentOptions.contentType() != null) {
      builder.header("Content-Type", putLocalDocumentOptions.contentType());
    }
    if (putLocalDocumentOptions.batch() != null) {
      builder.query("batch", putLocalDocumentOptions.batch());
    }
    builder.bodyContent(putLocalDocumentOptions.contentType(), putLocalDocumentOptions.document(),
      null, putLocalDocumentOptions.body());
    ResponseConverter<DocumentResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DocumentResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query a list of all local documents in a database.
   *
   * Queries the list of all local document IDs. The results matching the request body parameters are returned in a JSON
   * object, including a list of matching local documents with basic contents, such as the ID. When no request body
   * parameters are specified, results for all local documents in the database are returned. Optionally, document
   * content or additional metadata can be included in the response.
   *
   * @param postLocalDocsOptions the {@link PostLocalDocsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AllDocsResult}
   */
  public ServiceCall<AllDocsResult> postLocalDocs(PostLocalDocsOptions postLocalDocsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postLocalDocsOptions,
      "postLocalDocsOptions cannot be null");
    String[] pathSegments = { "", "_local_docs" };
    String[] pathParameters = { postLocalDocsOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postLocalDocs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (postLocalDocsOptions.accept() != null) {
      builder.header("Accept", postLocalDocsOptions.accept());
    }
    final JsonObject contentJson = new JsonObject();
    if (postLocalDocsOptions.attEncodingInfo() != null) {
      contentJson.addProperty("att_encoding_info", postLocalDocsOptions.attEncodingInfo());
    }
    if (postLocalDocsOptions.attachments() != null) {
      contentJson.addProperty("attachments", postLocalDocsOptions.attachments());
    }
    if (postLocalDocsOptions.conflicts() != null) {
      contentJson.addProperty("conflicts", postLocalDocsOptions.conflicts());
    }
    if (postLocalDocsOptions.descending() != null) {
      contentJson.addProperty("descending", postLocalDocsOptions.descending());
    }
    if (postLocalDocsOptions.includeDocs() != null) {
      contentJson.addProperty("include_docs", postLocalDocsOptions.includeDocs());
    }
    if (postLocalDocsOptions.inclusiveEnd() != null) {
      contentJson.addProperty("inclusive_end", postLocalDocsOptions.inclusiveEnd());
    }
    if (postLocalDocsOptions.limit() != null) {
      contentJson.addProperty("limit", postLocalDocsOptions.limit());
    }
    if (postLocalDocsOptions.skip() != null) {
      contentJson.addProperty("skip", postLocalDocsOptions.skip());
    }
    if (postLocalDocsOptions.updateSeq() != null) {
      contentJson.addProperty("update_seq", postLocalDocsOptions.updateSeq());
    }
    if (postLocalDocsOptions.endkey() != null) {
      contentJson.addProperty("endkey", postLocalDocsOptions.endkey());
    }
    if (postLocalDocsOptions.key() != null) {
      contentJson.addProperty("key", postLocalDocsOptions.key());
    }
    if (postLocalDocsOptions.keys() != null) {
      contentJson.add("keys", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postLocalDocsOptions.keys()));
    }
    if (postLocalDocsOptions.startkey() != null) {
      contentJson.addProperty("startkey", postLocalDocsOptions.startkey());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AllDocsResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AllDocsResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Multi-query the list of all local documents in a database.
   *
   * Runs multiple view queries of all local documents in this database. This operation enables you to request multiple
   * queries in a single request, in place of multiple `POST /{db}/_local_docs` requests.
   *
   * @param postLocalDocsQueriesOptions the {@link PostLocalDocsQueriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AllDocsQueriesResult}
   */
  public ServiceCall<AllDocsQueriesResult> postLocalDocsQueries(PostLocalDocsQueriesOptions postLocalDocsQueriesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postLocalDocsQueriesOptions,
      "postLocalDocsQueriesOptions cannot be null");
    String[] pathSegments = { "", "_local_docs/queries" };
    String[] pathParameters = { postLocalDocsQueriesOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postLocalDocsQueries");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (postLocalDocsQueriesOptions.accept() != null) {
      builder.header("Accept", postLocalDocsQueriesOptions.accept());
    }
    final JsonObject contentJson = new JsonObject();
    if (postLocalDocsQueriesOptions.queries() != null) {
      contentJson.add("queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(postLocalDocsQueriesOptions.queries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AllDocsQueriesResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AllDocsQueriesResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Commit any recent changes to the specified database to disk.
   *
   * Commits any recent changes to the specified database to disk. You must make a request to this endpoint if you want
   * to ensure that recent changes have been flushed. This function is likely not required, assuming you have the
   * recommended configuration setting, `delayed_commits=false`. This setting requires that changes are written to disk
   * before a 200 or similar result is returned.
   *
   * @param postEnsureFullCommitOptions the {@link PostEnsureFullCommitOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EnsureFullCommitInformation}
   */
  public ServiceCall<EnsureFullCommitInformation> postEnsureFullCommit(PostEnsureFullCommitOptions postEnsureFullCommitOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postEnsureFullCommitOptions,
      "postEnsureFullCommitOptions cannot be null");
    String[] pathSegments = { "", "_ensure_full_commit" };
    String[] pathParameters = { postEnsureFullCommitOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postEnsureFullCommit");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<EnsureFullCommitInformation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EnsureFullCommitInformation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query which document revisions are missing from the database.
   *
   * Given a list of document revisions, returns the document revisions that do not exist in the database.
   *
   * @param postMissingRevsOptions the {@link PostMissingRevsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MissingRevsResult}
   */
  public ServiceCall<MissingRevsResult> postMissingRevs(PostMissingRevsOptions postMissingRevsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postMissingRevsOptions,
      "postMissingRevsOptions cannot be null");
    String[] pathSegments = { "", "_missing_revs" };
    String[] pathParameters = { postMissingRevsOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postMissingRevs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (postMissingRevsOptions.documentRevisions() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(postMissingRevsOptions.documentRevisions()), "application/json");
    }
    ResponseConverter<MissingRevsResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MissingRevsResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Query the document revisions and possible ancestors missing from the database.
   *
   * The replicator is the primary user of this operation. After receiving a set of new revision IDs from the source
   * database, the replicator sends this set to the destination database's `_revs_diff` to find out which of them
   * already exists there. It can then avoid fetching and sending already-known document bodies.
   *
   * @param postRevsDiffOptions the {@link PostRevsDiffOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, RevsDiff>> postRevsDiff(PostRevsDiffOptions postRevsDiffOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postRevsDiffOptions,
      "postRevsDiffOptions cannot be null");
    String[] pathSegments = { "", "_revs_diff" };
    String[] pathParameters = { postRevsDiffOptions.db() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "postRevsDiff");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (postRevsDiffOptions.documentRevisions() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(postRevsDiffOptions.documentRevisions()), "application/json");
    }
    ResponseConverter<Map<String, RevsDiff>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, RevsDiff>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve shard information.
   *
   * List each shard range and the corresponding replicas for a specified database.
   *
   * @param getShardsInformationOptions the {@link GetShardsInformationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ShardsInformation}
   */
  public ServiceCall<ShardsInformation> getShardsInformation(GetShardsInformationOptions getShardsInformationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getShardsInformationOptions,
      "getShardsInformationOptions cannot be null");
    String[] pathSegments = { "", "_shards" };
    String[] pathParameters = { getShardsInformationOptions.db() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getShardsInformation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ShardsInformation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ShardsInformation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve shard information for a specific document.
   *
   * Retrieves information about a specific shard where a particular document is stored, along with information about
   * the nodes where that shard has a replica.
   *
   * @param getDocumentShardsInfoOptions the {@link GetDocumentShardsInfoOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DocumentShardInfo}
   */
  public ServiceCall<DocumentShardInfo> getDocumentShardsInfo(GetDocumentShardsInfoOptions getDocumentShardsInfoOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDocumentShardsInfoOptions,
      "getDocumentShardsInfoOptions cannot be null");
    String[] pathSegments = { "", "_shards" };
    String[] pathParameters = { getDocumentShardsInfoOptions.db(), getDocumentShardsInfoOptions.docId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getDocumentShardsInfo");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DocumentShardInfo> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DocumentShardInfo>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve list of running tasks.
   *
   * Lists running tasks, including the task type, name, status, and process ID. The result includes a JSON array of the
   * currently running tasks, with each task described as a single object. Depending on the operation type, the set of
   * response object fields might be different.
   *
   * @param getActiveTasksOptions the {@link GetActiveTasksOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<ActiveTask>> getActiveTasks(GetActiveTasksOptions getActiveTasksOptions) {
    String[] pathSegments = { "_active_tasks" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getActiveTasks");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<List<ActiveTask>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<ActiveTask>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve list of running tasks.
   *
   * Lists running tasks, including the task type, name, status, and process ID. The result includes a JSON array of the
   * currently running tasks, with each task described as a single object. Depending on the operation type, the set of
   * response object fields might be different.
   *
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<ActiveTask>> getActiveTasks() {
    return getActiveTasks(null);
  }

  /**
   * Retrieve information about whether the server is up.
   *
   * Confirms that the server is up, running, and ready to respond to requests. If `maintenance_mode` is `true` or
   * `nolb`, the endpoint returns a 404 response.
   *
   * @param getUpInformationOptions the {@link GetUpInformationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link UpInformation}
   */
  public ServiceCall<UpInformation> getUpInformation(GetUpInformationOptions getUpInformationOptions) {
    String[] pathSegments = { "_up" };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cloudant", "v1", "getUpInformation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<UpInformation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<UpInformation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve information about whether the server is up.
   *
   * Confirms that the server is up, running, and ready to respond to requests. If `maintenance_mode` is `true` or
   * `nolb`, the endpoint returns a 404 response.
   *
   * @return a {@link ServiceCall} with a result of type {@link UpInformation}
   */
  public ServiceCall<UpInformation> getUpInformation() {
    return getUpInformation(null);
  }

}

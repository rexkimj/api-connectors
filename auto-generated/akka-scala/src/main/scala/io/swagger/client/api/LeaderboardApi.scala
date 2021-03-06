/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.Leaderboard
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object LeaderboardApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[Leaderboard] (Request was successful)
   * 
   * @param method Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot;
   */
  def leaderboard.get(method: Option[String]): ApiRequest[Seq[Leaderboard]] =
    ApiRequest[Seq[Leaderboard]](ApiMethods.GET, "https://localhost/api/v1", "/leaderboard", "application/json")
      .withQueryParam("method", method)
      .withSuccessResponse[Seq[Leaderboard]](200)
      

}


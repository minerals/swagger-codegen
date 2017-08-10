/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.FakeApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \&quot; \\  *_/ &#39; \&quot; &#x3D;end --       
 * Version: 1.0.0 *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
/**
 * @license Apache 2.0 *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
 * http://www.apache.org/licenses/LICENSE-2.0.html *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
 */

goog.provide('API.Client.FakeApi');


/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.FakeApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('FakeApiBasePath') ?
                   /** @type {!string} */ ($injector.get('FakeApiBasePath')) :
                   'https://petstore.swagger.io *_/ ' \" =end -- \\r\\n \\n \\r/v2 *_/ ' \" =end -- \\r\\n \\n \\r';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('FakeApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('FakeApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.FakeApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
 * 
 * @param {!string=} opt_testCodeInjectEndRnNR To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.FakeApi.prototype.testCodeInjectEndRnNR = function(opt_testCodeInjectEndRnNR, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fake';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['test code inject */ &#39; &quot; &#x3D;end -- \r\n \n \r'] = opt_testCodeInjectEndRnNR;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'PUT',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

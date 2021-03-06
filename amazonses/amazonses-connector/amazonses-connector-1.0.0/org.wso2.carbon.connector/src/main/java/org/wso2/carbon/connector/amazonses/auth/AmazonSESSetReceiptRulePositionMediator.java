/*
 *  Copyright (c) 2005-2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.connector.amazonses.auth;

import org.wso2.carbon.connector.amazonses.constants.AmazonSESConstants;
import java.util.HashMap;
import java.util.Map;

public class AmazonSESSetReceiptRulePositionMediator extends AmazonSESMediatorBase {
    /**
     * Gets the single valued parameters map.
     *
     * @return the single valued parameters map
     */
    @Override
    protected final Map<String, String> getSingleValuedParametersMap() {

        Map<String, String> parameterMap = new HashMap<String, String>();
        parameterMap.put(AmazonSESConstants.API_AFTER, AmazonSESConstants.ESB_AFTER);
        parameterMap.put(AmazonSESConstants.API_RECEIPT_RULE_NAME, AmazonSESConstants.ESB_RECEIPT_RULE_NAME);
        parameterMap.put(AmazonSESConstants.API_RECEIPT_RULE_SET_NAME, AmazonSESConstants.ESB_RECEIPT_RULE_SET_NAME);
        return parameterMap;
    }
}
/*
 * oxAuth is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2014, Gluu
 */

package org.xdi.oxauth.interception;

import org.xdi.oxauth.model.common.BackchannelTokenDeliveryMode;
import org.xdi.oxauth.model.error.DefaultErrorResponse;

import java.util.List;

/**
 * @author Javier Rojas Blum
 * @version May 22, 2019
 */
public interface CIBAAuthorizeParamsValidatorInterceptionInterface {

    DefaultErrorResponse validateParams(
            List<String> scopeList, String clientNotificationToken, BackchannelTokenDeliveryMode tokenDeliveryMode,
            String loginHintToken, String idTokenHint, String loginHint, String bindingMessage,
            Boolean backchannelUserCodeParameter, String userCode);
}

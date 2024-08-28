/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2023
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.oss.mediation.o1.api;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.cache.CacheDefinition;
import com.ericsson.oss.itpf.modeling.annotation.cache.CacheMode;

@EModel(description = "Heartbeat Notification Cache for O1 Nodes", name = Constants.HEARTBEAT_CACHE_NAME)
@CacheDefinition(cacheMode = CacheMode.REPLICATED_SYNC, keyClass = String.class, valueClass = Long.class)
public class O1HeartbeatNotificationCache {}

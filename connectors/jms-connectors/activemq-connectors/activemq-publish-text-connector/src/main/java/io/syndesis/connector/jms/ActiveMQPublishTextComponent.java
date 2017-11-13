/**
 * Copyright (C) 2017 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.syndesis.connector.jms;

import org.apache.camel.Exchange;
import org.apache.camel.Message;

/**
 * Camel activemq-publish-text connector
 */
public class ActiveMQPublishTextComponent extends AbstractActiveMQConnector {

    public ActiveMQPublishTextComponent() {
        super("activemq-publish-text", ActiveMQPublishTextComponent.class.getName());

        setBeforeProducer( (Exchange exchange) -> {

            // extract headers and body
            Message out = exchange.getIn();
            JmsTextMessage jmsTextMessage = out.getBody(JmsTextMessage.class);
            out.setBody(jmsTextMessage.getBody());
            if (jmsTextMessage.getHeaders() != null) {
                out.setHeaders(jmsTextMessage.getHeaders());
            }
        });
    }

}

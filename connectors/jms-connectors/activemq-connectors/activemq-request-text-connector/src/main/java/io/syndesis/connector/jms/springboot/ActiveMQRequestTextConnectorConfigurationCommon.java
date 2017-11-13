package io.syndesis.connector.jms.springboot;

import javax.annotation.Generated;

/**
 * Request JMS Message
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.connector.SpringBootAutoConfigurationMojo")
public class ActiveMQRequestTextConnectorConfigurationCommon {

    /**
     * The maximum number of connections available to endpoints started under
     * this component
     */
    private Integer connectionCount = 1;
    /**
     * The kind of destination to use
     */
    private String destinationType = "queue";
    /**
     * DestinationName is a JMS queue or topic name. By default the
     * destinationName is interpreted as a queue name.
     */
    private String destinationName;
    /**
     * Sets the number of consumer listeners used for this endpoint.
     */
    private int consumerCount = 1;
    /**
     * Sets the durable subscription Id required for durable topics.
     */
    private String durableSubscriptionId;
    /**
     * Sets whether synchronous processing should be strictly used or Camel is
     * allowed to use asynchronous processing (if supported).
     */
    private boolean synchronous = true;
    /**
     * Sets the JMS Message selector syntax.
     */
    private String messageSelector;
    /**
     * Sets the reply to destination name used for InOut producer endpoints.
     */
    private String namedReplyTo;
    /**
     * Flag used to enable/disable message persistence.
     */
    private boolean persistent = true;
    /**
     * Sets the number of producers used for this endpoint.
     */
    private int producerCount = 1;
    /**
     * Flag used to adjust the Time To Live value of produced messages.
     */
    private long ttl = -1L;
    /**
     * Whether to allow sending messages with no body. If this option is false
     * and the message body is null then an JMSException is thrown.
     */
    private boolean allowNullBody = true;
    /**
     * Whether to prefill the producer connection pool on startup or create
     * connections lazy when needed.
     */
    private boolean prefillPool = true;
    /**
     * Sets the amount of time we should wait before timing out a InOut
     * response.
     */
    private long responseTimeOut = 5000L;
    /**
     * Whether to startup the consumer message listener asynchronously when
     * starting a route. For example if a JmsConsumer cannot get a connection to
     * a remote JMS broker then it may block while retrying and/or failover.
     * This will cause Camel to block while starting routes. By setting this
     * option to true you will let routes startup while the JmsConsumer connects
     * to the JMS broker using a dedicated thread in asynchronous mode. If this
     * option is used then beware that if the connection could not be
     * established then an exception is logged at WARN level and the consumer
     * will not be able to receive messages; You can then restart the route to
     * retry.
     */
    private boolean asyncStartListener = false;
    /**
     * Whether to stop the consumer message listener asynchronously when
     * stopping a route.
     */
    private boolean asyncStopListener = false;
    /**
     * Whether to include all JMSXxxx properties when mapping from JMS to Camel
     * Message. Setting this to true will include properties such as JMSXAppID
     * and JMSXUserID etc. Note: If you are using a custom headerFilterStrategy
     * then this option does not apply.
     */
    private boolean includeAllJMSXProperties = false;
    /**
     * Specifies whether to use transacted mode
     */
    private boolean transacted = false;
    /**
     * If transacted sets the number of messages to process before committing a
     * transaction.
     */
    private int transactionBatchCount = -1;
    /**
     * Sets timeout (in millis) for batch transactions the value should be 1000
     * or higher.
     */
    private long transactionBatchTimeout = 5000L;
    /**
     * Specifies whether to share JMS session with other SJMS endpoints. Turn
     * this off if your route is accessing to multiple JMS providers. If you
     * need transaction against multiple JMS providers use jms component to
     * leverage XA transaction.
     */
    private boolean sharedJMSSession = true;
    /**
     * Broker URL
     */
    private String brokerUrl;
    /**
     * Authorization credential user name
     */
    private String username;
    /**
     * Authorization credential password
     */
    private String password;

    public Integer getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(Integer connectionCount) {
        this.connectionCount = connectionCount;
    }

    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public int getConsumerCount() {
        return consumerCount;
    }

    public void setConsumerCount(int consumerCount) {
        this.consumerCount = consumerCount;
    }

    public String getDurableSubscriptionId() {
        return durableSubscriptionId;
    }

    public void setDurableSubscriptionId(String durableSubscriptionId) {
        this.durableSubscriptionId = durableSubscriptionId;
    }

    public boolean isSynchronous() {
        return synchronous;
    }

    public void setSynchronous(boolean synchronous) {
        this.synchronous = synchronous;
    }

    public String getMessageSelector() {
        return messageSelector;
    }

    public void setMessageSelector(String messageSelector) {
        this.messageSelector = messageSelector;
    }

    public String getNamedReplyTo() {
        return namedReplyTo;
    }

    public void setNamedReplyTo(String namedReplyTo) {
        this.namedReplyTo = namedReplyTo;
    }

    public boolean isPersistent() {
        return persistent;
    }

    public void setPersistent(boolean persistent) {
        this.persistent = persistent;
    }

    public int getProducerCount() {
        return producerCount;
    }

    public void setProducerCount(int producerCount) {
        this.producerCount = producerCount;
    }

    public long getTtl() {
        return ttl;
    }

    public void setTtl(long ttl) {
        this.ttl = ttl;
    }

    public boolean isAllowNullBody() {
        return allowNullBody;
    }

    public void setAllowNullBody(boolean allowNullBody) {
        this.allowNullBody = allowNullBody;
    }

    public boolean isPrefillPool() {
        return prefillPool;
    }

    public void setPrefillPool(boolean prefillPool) {
        this.prefillPool = prefillPool;
    }

    public long getResponseTimeOut() {
        return responseTimeOut;
    }

    public void setResponseTimeOut(long responseTimeOut) {
        this.responseTimeOut = responseTimeOut;
    }

    public boolean isAsyncStartListener() {
        return asyncStartListener;
    }

    public void setAsyncStartListener(boolean asyncStartListener) {
        this.asyncStartListener = asyncStartListener;
    }

    public boolean isAsyncStopListener() {
        return asyncStopListener;
    }

    public void setAsyncStopListener(boolean asyncStopListener) {
        this.asyncStopListener = asyncStopListener;
    }

    public boolean isIncludeAllJMSXProperties() {
        return includeAllJMSXProperties;
    }

    public void setIncludeAllJMSXProperties(boolean includeAllJMSXProperties) {
        this.includeAllJMSXProperties = includeAllJMSXProperties;
    }

    public boolean isTransacted() {
        return transacted;
    }

    public void setTransacted(boolean transacted) {
        this.transacted = transacted;
    }

    public int getTransactionBatchCount() {
        return transactionBatchCount;
    }

    public void setTransactionBatchCount(int transactionBatchCount) {
        this.transactionBatchCount = transactionBatchCount;
    }

    public long getTransactionBatchTimeout() {
        return transactionBatchTimeout;
    }

    public void setTransactionBatchTimeout(long transactionBatchTimeout) {
        this.transactionBatchTimeout = transactionBatchTimeout;
    }

    public boolean isSharedJMSSession() {
        return sharedJMSSession;
    }

    public void setSharedJMSSession(boolean sharedJMSSession) {
        this.sharedJMSSession = sharedJMSSession;
    }

    public String getBrokerUrl() {
        return brokerUrl;
    }

    public void setBrokerUrl(String brokerUrl) {
        this.brokerUrl = brokerUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
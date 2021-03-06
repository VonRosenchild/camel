/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.nsq;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class NsqEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        NsqEndpoint target = (NsqEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autofinish":
        case "autoFinish": target.getConfiguration().setAutoFinish(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "channel": target.getConfiguration().setChannel(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "lookupinterval":
        case "lookupInterval": target.getConfiguration().setLookupInterval(property(camelContext, long.class, value)); return true;
        case "lookupserverport":
        case "lookupServerPort": target.getConfiguration().setLookupServerPort(property(camelContext, int.class, value)); return true;
        case "messagetimeout":
        case "messageTimeout": target.getConfiguration().setMessageTimeout(property(camelContext, long.class, value)); return true;
        case "poolsize":
        case "poolSize": target.getConfiguration().setPoolSize(property(camelContext, int.class, value)); return true;
        case "port": target.getConfiguration().setPort(property(camelContext, int.class, value)); return true;
        case "requeueinterval":
        case "requeueInterval": target.getConfiguration().setRequeueInterval(property(camelContext, long.class, value)); return true;
        case "secure": target.getConfiguration().setSecure(property(camelContext, boolean.class, value)); return true;
        case "servers": target.getConfiguration().setServers(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "useragent":
        case "userAgent": target.getConfiguration().setUserAgent(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}


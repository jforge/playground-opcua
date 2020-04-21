package io.eol.opcua.client;

import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.identity.AnonymousProvider;
import org.eclipse.milo.opcua.sdk.client.api.identity.IdentityProvider;
import org.eclipse.milo.opcua.stack.core.security.SecurityPolicy;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;

public interface OpcuaClientSample {

	default String getEndpointUrl() {
	    return OpcuaClientConfiguration.OPCUA_ENDPOINT_URL_LOCAL;
    }

    default Predicate<EndpointDescription> endpointFilter() {
        return e -> true;
    }

    default SecurityPolicy getSecurityPolicy() {
        return SecurityPolicy.None;
    }

    default IdentityProvider getIdentityProvider() {
        return new AnonymousProvider();
    }

    void run(OpcUaClient client, CompletableFuture<OpcUaClient> future) throws Exception;

}

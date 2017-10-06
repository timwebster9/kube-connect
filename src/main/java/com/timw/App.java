package com.timw;

import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final App app = new App();
        app.connect();

    }

    public void connect() {

        Config config = new ConfigBuilder().withMasterUrl("https://neptune:8080/r/projects/1a92/kubernetes:6443")
                .withUsername("374C4FAC4F134463CFE1")
                .withPassword("g2JBKyLdixCAn6Q8X4tQywQFrgt2QWWnYfEvYxVn")
                .withTrustCerts(true)
                .build();
        KubernetesClient client = new DefaultKubernetesClient(config);
        client.pods().list();

    }

}

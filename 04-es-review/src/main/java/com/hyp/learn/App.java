package com.hyp.learn;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                    .addTransportAddress(
                            new InetSocketTransportAddress(
                                    InetAddress.getByName("127.0.0.1"), 9300
                            )
                    );
            System.out.println(client.listedNodes());
        } catch (UnknownHostException e) {
            System.out.println("初始化失败....");
            e.printStackTrace();
        }
    }
}

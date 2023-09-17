package com.soap;

import com.soap.client.SoapClient;
import com.soap.wsdl.AddResponse;
import com.soap.wsdl.DivideResponse;
import com.soap.wsdl.MultiplyResponse;
import com.soap.wsdl.SubtractResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootSoapApplication {

//    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootSoapApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSoapApplication.class, args);
    }

//    @Bean
//    CommandLineRunner init(SoapClient soapClient){
//        return args -> {
//            AddResponse addResponse = soapClient.getAddResponse(2, 2);
//            LOGGER.info("La suma entre los números {} y {} es: {}", 2, 2, addResponse.getAddResult());
//
//            SubtractResponse subtractResponse = soapClient.getSubtractResponse(20, 4);
//            LOGGER.info("La resta entre los números {} y {} es: {}", 20, 4, subtractResponse.getSubtractResult());
//
//            MultiplyResponse multiplyResponse = soapClient.getMultiplyResponse(5, 7);
//            LOGGER.info("La multiplicación entre los números {} y {} es: {}", 5, 7, multiplyResponse.getMultiplyResult());
//
//            DivideResponse divideResponse = soapClient.getDivideResponse(5, 2);
//            LOGGER.info("La División entre los números {} y {} es: {}", 5, 2, divideResponse.getDivideResult());
//        };
//    }
}

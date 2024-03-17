package com.pixeltrice.springbootcallapp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.net.URI;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class SpringbootcallappApplication implements ApplicationRunner {

	private final static String SID_ACCOUNT = "AC6ef279a8848b095539e7fe6f81453cb9";
	private final static String AUTH_ID = "4c1376363260a8c6dafedc453ad1570a";
	private final static String FROM_NUMBER = "+14434062155";
	private final static String TO_NUMBER = "+918146832084";

	static {
		Twilio.init(SID_ACCOUNT, AUTH_ID);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcallappApplication.class, args);

	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		Call.creator(new PhoneNumber(TO_NUMBER), new PhoneNumber(FROM_NUMBER),
				   new URI("http://demo.twilio.com/docs/voice.xml")).create();
		
	}

}

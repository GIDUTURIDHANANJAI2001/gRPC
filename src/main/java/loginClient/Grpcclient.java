package loginClient;
 import com.loginsjavastubs.grpc.User;
 import com.loginsjavastubs.grpc.User.APIResponse;
import com.loginsjavastubs.grpc.User.LoginRequest;
import com.loginsjavastubs.grpc.UserServiceGrpc;
import com.loginsjavastubs.grpc.UserServiceGrpc.UserServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Grpcclient {
	public static APIResponse userdetails(String username , String password) {
		APIResponse response = null;
		try {

			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
			UserServiceBlockingStub userstub = UserServiceGrpc.newBlockingStub(channel);

			LoginRequest loginrequest = LoginRequest.newBuilder()
					.setUsername(username)
					.setPassword(password).build();
			System.out.println(loginrequest.toString());
			response = userstub.login(loginrequest);
			System.out.println("the response is " + response.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
//public static void main(String[] args) {
//	try
//	{
//		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
//		UserServiceBlockingStub  userstub = UserServiceGrpc.newBlockingStub(channel);
//
//		LoginRequest loginrequest = LoginRequest.newBuilder().setUsername("dhanu").setPassword("dhanu").build();
//		System.out.println(loginrequest.toString());
//		APIResponse response = userstub.login(loginrequest);
//		System.out.println("the response is " + response.toString());}
//	catch(Exception e)
//	{
//		e.printStackTrace();
//	}
//}




}

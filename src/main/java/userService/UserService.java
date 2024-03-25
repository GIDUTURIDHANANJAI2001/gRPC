package userService;

import com.loginsjavastubs.grpc.User.APIResponse;
import com.loginsjavastubs.grpc.User.Empty;
import com.loginsjavastubs.grpc.User.LoginRequest;
import com.loginsjavastubs.grpc.UserServiceGrpc.UserServiceImplBase;

import io.grpc.stub.StreamObserver;

public class UserService extends UserServiceImplBase{

	APIResponse.Builder response = APIResponse.newBuilder();
	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("server came inside login");
		String username = request.getUsername();
		String password = request.getPassword();
		
		if(username.equalsIgnoreCase(password))
		{
			response.setResponsecode(0).setResponsemessage("SUCESS");
		}
		else
		{
			response.setResponsecode(100).setResponsemessage("INVALID");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
	
	}

	
}

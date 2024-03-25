package instagramService;

import com.Instagramjavastubs.grpc.Instagram.Result;
import com.Instagramjavastubs.grpc.Instagram.SignupHead;
import com.Instagramjavastubs.grpc.Instagram.signupRequest;
import com.Instagramjavastubs.grpc.Instagram.signupResponse;
import com.Instagramjavastubs.grpc.InstagramServiceGrpc.InstagramServiceImplBase;

import io.grpc.stub.StreamObserver;

public class instagramService extends InstagramServiceImplBase {

    @Override
    public void signup(signupRequest request, StreamObserver<signupResponse> responseObserver) {
    	
    	System.out.println("server inside instagram service");
    	
        String firstName = request.getSignupHead().getFirstname();
        String lastName = request.getSignupHead().getSecondname();
        String email = request.getSignupHead().getEmail();
        int phoneNumber = request.getSignupHead().getPhoneno();
        String dob = request.getSignupHead().getDob();
        String country = request.getSignupHead().getCountry();
        String middlename = request.getSignupHead().getMiddlename();


        SignupHead signupHead = SignupHead.newBuilder()
                .setFirstname(firstName)
                .setSecondname(lastName)
                .setEmail(email)
                .setPhoneno(phoneNumber)
                .setDob(dob)
                .setCountry(country)
                .setMiddlename(middlename)
                .build();

        Result result;
        if (country.equalsIgnoreCase("INDIA")) {
            result = Result.newBuilder().setResultmsg("Success: User created in India").build();
        } else {
            result = Result.newBuilder().setResultmsg("Error: User creation not supported in this country").build();
        }

        signupResponse response = signupResponse.newBuilder()
                .setSignuphead(signupHead)
                .setResult(result)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

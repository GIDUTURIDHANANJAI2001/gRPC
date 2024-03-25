package InstagramClient;

import com.Instagramjavastubs.grpc.Instagram;
import com.loginsjavastubs.grpc.UserServiceGrpc;
import com.Instagramjavastubs.grpc.Instagram.SignupHead;
import com.Instagramjavastubs.grpc.Instagram.signupRequest;
import com.Instagramjavastubs.grpc.Instagram.signupResponse;
import com.Instagramjavastubs.grpc.InstagramServiceGrpc;
import com.Instagramjavastubs.grpc.InstagramServiceGrpc.InstagramServiceBlockingStub;
import com.loginsjavastubs.grpc.User.APIResponse;
import com.loginsjavastubs.grpc.User.LoginRequest;
import com.loginsjavastubs.grpc.UserServiceGrpc.UserServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class InstaClient {

    static ManagedChannel channel;

    static InstagramServiceBlockingStub userstub;

    public static signupResponse instarequest(String firstname, String lastname,String middlename , String email, int phno, String dob, String country,String mothername) {
        signupResponse response = null;
        try {

            channel = ManagedChannelBuilder.forAddress("localhost", 9051).usePlaintext().build();
            userstub = InstagramServiceGrpc.newBlockingStub(channel);


            SignupHead signuphead = SignupHead.newBuilder()
                    .setFirstname(firstname)
                    .setSecondname(lastname)
                    .setEmail(email)
                    .setDob(dob)
                    .setPhoneno(phno)
                    .setCountry(country)
                    .setMiddlename(middlename)
                    .setMothername(mothername)
                    .build();

            signupRequest request = signupRequest.newBuilder().setSignupHead(signuphead).build();
            System.out.println("request is " + request);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            //it slows the output

            response = userstub.signup(request);
            System.out.println("response is :" + response);

            try {
                Thread.sleep(10000); // Sleep for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            //it slows the output


        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}

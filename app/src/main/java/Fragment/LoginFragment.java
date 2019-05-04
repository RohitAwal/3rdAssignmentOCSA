package Fragment;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.a3rdassignmentocsa.R;
import com.e.a3rdassignmentocsa.ViewPagerActivity;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    private Context mcontext;
    private EditText etUsername,etPassword;
    private Button btnLogin;




    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login,container,false);
        etUsername = view.findViewById(R.id.etUsername);
        etPassword = view.findViewById(R.id.etPassword);
        btnLogin = view.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUser();
            }
        });
        return view;
    }

    private void checkUser() {
        SharedPreferences sharedPreferences = mcontext.getSharedPreferences("user",MODE_PRIVATE);
        String username =sharedPreferences.getString("username","");
        String password = sharedPreferences.getString("password","");
        if (username.equals(etUsername.getText().toString()) &&
                password.equals(etPassword.getText().toString())) {
            Toast.makeText(getContext(), "Successful", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(getContext(), "Either username or password is incorrect", Toast.LENGTH_SHORT).show();
        }

    }

}

/*
* Copyright 2015 - learnNcode (learnncode@gmail.com)
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/

package com.android.tostringcontainsdemo;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new DemoFragment())
                    .commit();
        }
    }


    public static class DemoFragment extends ListFragment {

        public DemoFragment() {
        }


        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);


            List<User> userList = new ArrayList<User>();
            userList.add(new User("abc"));
            userList.add(new User("cde"));
            userList.add(new User("efg"));
            userList.add(new User("xyz"));

            ArrayAdapter mAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, userList);
            setListAdapter(mAdapter);


            if (userList.contains(new User("efg"))){
                Toast.makeText(getActivity(), "   !!!  Found  !!!  ", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(getActivity(), "   !!!  Not Found  !!!  ", Toast.LENGTH_SHORT).show();
            }



        }
    }
}

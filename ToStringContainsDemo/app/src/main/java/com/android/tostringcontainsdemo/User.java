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

public class User {

    public String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public String toString() {
       return name;
    }

    @Override
    public boolean equals(Object object) {
        User model = (User) object;
        if (model.name.equalsIgnoreCase(this.name) && object.getClass() == getClass())
            return true;
        return false;
    }
}

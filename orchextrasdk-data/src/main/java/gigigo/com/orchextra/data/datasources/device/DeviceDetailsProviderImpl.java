/*
 * Created by Orchextra
 *
 * Copyright (C) 2016 Gigigo Mobile Services SL
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package gigigo.com.orchextra.data.datasources.device;

import android.content.Context;
import com.gigigo.ggglib.device.DeviceInfoProvider;
import com.gigigo.orchextra.domain.abstractions.device.DeviceDetailsProvider;


public class DeviceDetailsProviderImpl implements DeviceDetailsProvider {

  private Context context;

  public DeviceDetailsProviderImpl(Context context) {
    this.context = context;
  }

  @Override public String getAndroidInstanceId() {
    return "HEYYY_THIS_IS_MY_ID";
    //return DeviceInfoProvider.getAndroidInstanceId(context);
  }

  @Override public String getAndroidSecureId() {
    return DeviceInfoProvider.getAndroidSecureId(context);
  }

  @Override public String getAndroidSerialNumber() {
    return DeviceInfoProvider.getAndroidSerialNumber();
  }

  @Override public String getWifiMac() {
    return DeviceInfoProvider.getWifiMac(context);
  }

  @Override public String getBluetoothMac() {
    return DeviceInfoProvider.getBluetoothMac();
  }
}

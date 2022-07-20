
# HMS Map Kit Example




## Prerequisites

- Create a AppGallery project - [Guide](https://developer.huawei.com/consumer/en/doc/distribution/app/agc-help-createproject-0000001100334664)

- Create an application in the project with the following packagename `com.oliverbotello.eha.mapkit` - [Guide](https://developer.huawei.com/consumer/en/doc/distribution/app/agc-help-createapp-0000001146718717#section1112105771619)

## Configuring AppGallery Connect
### Turn on the Maps API
I) Inside the `Project settings` option enter to `Manage APIs` section

II) Type `Map` in the search bar to filter the available APIs

III) Verify that the 'Map Kit' switch <img src="/readme/assets/switch.png?raw=true" style="height:20px"> is on (blue color), if it is off (gray color) it will be necessary to turn it on (clicking it)

![Turn on Map Kit API](/readme/assets/turn_of_map_kit_api.png?raw=true "Turn on Map Kit API")

### Create Key for Static Map
I) Search in the side menu (left side) for the `Build` section

II) In this one you will find the option of `Map Kit`

II) Clicking on this will show a sale similar to the one shown at the top

IV) Must click on the "Enable" button

V) The interface will change a bit and a `key` will have been generated for our static map (as shown in the image below)

### Download configuration json file
I) Before downloading the JSON it is recommended to have added the `SHA -256 fingerprint`, the following [guide](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/android-sdk-config-agc-0000001061560289#section147011294331) shows how to get and add it to our project

II) Download the file "agconnect-services.json."

## Configuring Android Project
### Configuring Signature
I) In the `app` folder you will find the file `build.gradle`

II) Opening it should locate the `signingConfigs` section, as shown in the image below

III) In this section you will have to replace the values of `keyAlias`, `keyPassword`, `storeFile` and `storePassword`

IV) The image, enclosed in a yellow box, shows the `key` used for the original project, as an example, the `storeFile` field should be as follows: ![storeFile](/readme/assets/storeFile.png?raw=true "storeFile")

### Set up AppGallery connection
I) The file `agconnect-services.json` that was downloaded in previous sections, should be pasted into the folder `app`, as shown in the image below.

### Configure API KEY
I) The `KEY API` can be obtained from the `Project Information` section in `Project Settings` of `AppGallery Connect` (example in the following image)

II) Once the `API KEY` has been copied, the value of `api_key` must be replaced in the file `strings.xml` that is located in the `values` folder of the Android project. Reference in the following image:

### Run the Application
I) Once all the configuration is done, you can execute the project, obtaining something similar to the following image:
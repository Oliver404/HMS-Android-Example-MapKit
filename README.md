
# HMS Map Kit Example

## Table of Contents
1. [Prerequisites](#prerequisites)
2. [Configuring AppGallery Connect](#configuring-appgallery-connect)
   1. [Turn on the Maps API](#turn-on-the-maps-api)
   2. [Create Key for Static Map](#create-key-for-static-map)
   3. [Download configuration json file](#download-configuration-json-file)
3. [Configuring Android Project](#configuring-android-project)
   1. [Configuring Signature](#configuring-signature)
   2. [Set up AppGallery connection](#set-up-appgallery-connection)
   2. [Configure API KEY](#configure-api-key)
4. [Run the Application](#run-the-application)

## Prerequisites
I) Create a AppGallery project - [Guide](https://developer.huawei.com/consumer/en/doc/distribution/app/agc-help-createproject-0000001100334664)

II) Create an application in the project with the following packagename `com.oliverbotello.eha.mapkit` - [Guide](https://developer.huawei.com/consumer/en/doc/distribution/app/agc-help-createapp-0000001146718717#section1112105771619)

## Configuring AppGallery Connect
### Turn on the Maps API
I) Inside the `Project settings` option enter to `Manage APIs` section

II) Type `Map` in the search bar to filter the available APIs

III) Verify that the 'Map Kit' switch <img src="/readme/assets/switch.png?raw=true" style="height:20px"> is on (blue color), if it is off (gray color) it will be necessary to turn it on (clicking it)

![Turn on Map Kit API](/readme/assets/turn_of_map_kit_api.png?raw=true "Turn on Map Kit API")

### Create Key for Static Map
I) Search in the side menu (left side) for the `Build` section

II) In this one you will find the option of `Map Kit`

II) Clicking on this will show a sale similar to the one shown at the bottom

![Map Kit Module](/readme/assets/map_kit_module.png?raw=true "Map Kit Module")

IV) Must click on the "Enable" button

V) The interface will change a bit and a `key` will have been generated for our static map (as shown in the image below)

![Key for Static Map](/readme/assets/key_static_map.png?raw=true "Key for Static Map")

### Download configuration json file
I) Before downloading the JSON it is recommended to have added the `SHA -256 fingerprint`, the following [guide](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/android-sdk-config-agc-0000001061560289#section147011294331) shows how to get and add it to our project

II) Download the file `agconnect-services.json`

![Download agconnect-services.json](/readme/assets/download_json.png?raw=true "Download agconnect-services.json")

## Configuring Android Project
### Configuring Signature
I) In the `app` folder you will find the file `build.gradle`

II) Opening it should locate the `signingConfigs` section, as shown in the image below

III) In this section you will have to replace the values of `keyAlias`, `keyPassword`, `storeFile` and `storePassword`

IV) The image, enclosed in a yellow box, shows the `key` used for the original project, as an example, the `storeFile` field should be as follows: <img src="/readme/assets/storeFile.png?raw=true" style="height:20px">

![Configuring Signature](/readme/assets/change_signature.png?raw=true "Configuring Signature")

### Set up AppGallery connection
I) The file `agconnect-services.json` that was downloaded in previous sections, should be pasted into the folder `app`, as shown in the image below.

![Paste agconnect-services.json](/readme/assets/paste_json.png?raw=true "Paste agconnect-services.json")

### Configure API KEY
I) The `KEY API` can be obtained from the `Project Information` section in `Project Settings` of `AppGallery Connect` (example in the following image)

![Copy API KEY](/readme/assets/console_api_key.png?raw=true "Copy API KEY")

II) Once the `API KEY` has been copied, the value of `api_key` must be replaced in the file `strings.xml` that is located in the `values` folder of the Android project. Reference in the following image:

![Change resource API KEY](/readme/assets/resource_api_key.png?raw=true "Change resource API KEY")

## Run the Application
I) Once all the configuration is done, you can execute the project, obtaining something similar to the following image:

![Result](/readme/assets/result.png?raw=true "Result")
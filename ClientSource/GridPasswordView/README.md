
# react-native-m215-grid-password-view

## Getting started

`$ npm install react-native-m215-grid-password-view --save`

### Mostly automatic installation

`$ react-native link react-native-m215-grid-password-view`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.M215_GridPasswordView.SMOM215GridPasswordViewPackage;` to the imports at the top of the file
  - Add `new SMOM215GridPasswordViewPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-m215-grid-password-view'
  	project(':react-native-m215-grid-password-view').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-m215-grid-password-view/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-m215-grid-password-view')
  	```


## Usage
```javascript
import SMOM215GridPasswordView from 'react-native-m215-grid-password-view';

// TODO: What to do with the module?
SMOM215GridPasswordView;
```
  

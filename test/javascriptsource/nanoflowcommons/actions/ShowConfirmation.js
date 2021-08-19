// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
import { Big } from "big.js";

// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * Shows a confirmation dialog before calling a given function.
 * @param {string} question - This field is required.
 * @param {string} cancelButtonCaption - Set to empty to use default text 'Cancel'.
 * @param {string} proceedButtonCaption - Set to empty to use default text 'OK'.
 * @returns {Promise.<boolean>}
 */
export async function ShowConfirmation(question, cancelButtonCaption, proceedButtonCaption) {
	// BEGIN USER CODE
  if (!question) {
    throw new TypeError("Input parameter 'Question' is required");
  }
  var cancel = cancelButtonCaption || "Cancel";
  var proceed = proceedButtonCaption || "OK";
  // Native platform
  if (navigator && navigator.product === "ReactNative") {
    var Alert = require("react-native").Alert;
    return new Promise(function (resolve) {
      Alert.alert("Confirmation", question, [
      { text: cancel, onPress: function onPress() {return resolve(false);}, style: "cancel" },
      { text: proceed, onPress: function onPress() {return resolve(true);} }]);

    });
  }
  // Other platforms
  return new Promise(function (resolve) {
    mx.ui.confirmation({
      content: question,
      proceed: proceed,
      cancel: cancel,
      handler: function handler() {return resolve(true);},
      onCancel: function onCancel() {return resolve(false);} });

  });
	// END USER CODE
}

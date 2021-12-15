// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package pushnotifications.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import pushnotifications.proxies.Message;
import static pushnotifications.proxies.microflows.Microflows.createAndSendMessageToDevice;

/**
 * Java action to use instead of microflow 'SendMessageImmediately'
 * Parameters: 
 * Device: Android or iOS
 * MessageText: the contents of the message
 * Title: The title of the message
 * Badge: a number that appears on the app icon (iOS)
 * LaunchImage: file name of the launch image (iOS)
 * Sound: name of system sound to play (iOS)
 * 
 */
public class SendMessageToDevice extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __MessageDataParam;
	private pushnotifications.proxies.MessageData MessageDataParam;
	private IMendixObject __DeviceParam;
	private pushnotifications.proxies.Device DeviceParam;
	private IMendixObject ContextObject;

	public SendMessageToDevice(IContext context, IMendixObject MessageDataParam, IMendixObject DeviceParam, IMendixObject ContextObject)
	{
		super(context);
		this.__MessageDataParam = MessageDataParam;
		this.__DeviceParam = DeviceParam;
		this.ContextObject = ContextObject;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		this.MessageDataParam = __MessageDataParam == null ? null : pushnotifications.proxies.MessageData.initialize(getContext(), __MessageDataParam);

		this.DeviceParam = __DeviceParam == null ? null : pushnotifications.proxies.Device.initialize(getContext(), __DeviceParam);

		// BEGIN USER CODE
		if (ContextObject != null) {
			Long guid = ContextObject.getId().toLong();
			MessageDataParam.setIdentifier(guid);
		}

		Message message = createAndSendMessageToDevice(getContext(), DeviceParam, MessageDataParam);
		return message.getMendixObject();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SendMessageToDevice";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

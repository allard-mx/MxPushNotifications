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
import java.util.ArrayList;
import java.util.List;
import static pushnotifications.proxies.microflows.Microflows.createAndSendMessageToDevices;

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
public class SendMessageToDevices extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private IMendixObject __MessageDataParam;
	private pushnotifications.proxies.MessageData MessageDataParam;
	private java.util.List<IMendixObject> __DeviceParam;
	private java.util.List<pushnotifications.proxies.Device> DeviceParam;
	private IMendixObject ContextObject;

	public SendMessageToDevices(IContext context, IMendixObject MessageDataParam, java.util.List<IMendixObject> DeviceParam, IMendixObject ContextObject)
	{
		super(context);
		this.__MessageDataParam = MessageDataParam;
		this.__DeviceParam = DeviceParam;
		this.ContextObject = ContextObject;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.MessageDataParam = this.__MessageDataParam == null ? null : pushnotifications.proxies.MessageData.initialize(getContext(), __MessageDataParam);

		this.DeviceParam = java.util.Optional.ofNullable(this.__DeviceParam)
			.orElse(java.util.Collections.emptyList())
			.stream()
			.map(__DeviceParamElement -> pushnotifications.proxies.Device.initialize(getContext(), __DeviceParamElement))
			.collect(java.util.stream.Collectors.toList());

		// BEGIN USER CODE
		if (ContextObject != null) {
			Long guid = ContextObject.getId().toLong();
			MessageDataParam.setIdentifier(guid);
		}

		List<Message> messages = createAndSendMessageToDevices(getContext(), DeviceParam, MessageDataParam);
		List<IMendixObject> objects = new ArrayList<>();
		messages.forEach(message -> {
            objects.add(message.getMendixObject());
		});
		return objects;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SendMessageToDevices";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

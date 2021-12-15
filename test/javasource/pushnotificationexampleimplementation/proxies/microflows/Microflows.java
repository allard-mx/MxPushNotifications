// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package pushnotificationexampleimplementation.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the PushNotificationExampleImplementation module
	public static boolean afterStartup(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("PushNotificationExampleImplementation.AfterStartup").withParams(params).execute(context);
	}
	public static void iVK_OpenSendMessageFormWithContext(IContext context, java.util.List<pushnotifications.proxies.Device> _devices)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.ArrayList<IMendixObject> listparam_devices = null;
		if (_devices != null)
		{
			listparam_devices = new java.util.ArrayList<>();
			for (pushnotifications.proxies.Device obj : _devices)
				listparam_devices.add(obj.getMendixObject());
		}
		params.put("Devices", listparam_devices);

		Core.microflowCall("PushNotificationExampleImplementation.IVK_OpenSendMessageFormWithContext").withParams(params).execute(context);
	}
	public static void iVK_OpenSendMessageFormWithoutContext(IContext context, java.util.List<pushnotifications.proxies.Device> _devices)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.ArrayList<IMendixObject> listparam_devices = null;
		if (_devices != null)
		{
			listparam_devices = new java.util.ArrayList<>();
			for (pushnotifications.proxies.Device obj : _devices)
				listparam_devices.add(obj.getMendixObject());
		}
		params.put("Devices", listparam_devices);

		Core.microflowCall("PushNotificationExampleImplementation.IVK_OpenSendMessageFormWithoutContext").withParams(params).execute(context);
	}
	public static void iVK_TestMessageCleanupScheduledEvent(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("PushNotificationExampleImplementation.IVK_TestMessageCleanupScheduledEvent").withParams(params).execute(context);
	}
	public static void microflowWithContext(IContext context, pushnotificationexampleimplementation.proxies.Test _test)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Test", _test == null ? null : _test.getMendixObject());
		Core.microflowCall("PushNotificationExampleImplementation.MicroflowWithContext").withParams(params).execute(context);
	}
	public static void microflowWithoutContext(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("PushNotificationExampleImplementation.MicroflowWithoutContext").withParams(params).execute(context);
	}
	public static void send(IContext context, pushnotifications.proxies.MessageView _messageView)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MessageView", _messageView == null ? null : _messageView.getMendixObject());
		Core.microflowCall("PushNotificationExampleImplementation.Send").withParams(params).execute(context);
	}
}
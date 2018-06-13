// This file was generated by Mendix Modeler 6.8.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the MyFirstModule module
	public static void actionMFWithContext(IContext context, myfirstmodule.proxies.ContextObject _contextObject)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ContextObject", _contextObject == null ? null : _contextObject.getMendixObject());
			Core.execute(context, "MyFirstModule.ActionMFWithContext", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean afterStartup(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			return (Boolean)Core.execute(context, "MyFirstModule.AfterStartup", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ConfigureAPNs(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.IVK_ConfigureAPNs", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ConfigureGCM(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.IVK_ConfigureGCM", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_OpenCreateLocalUserDialog(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.IVK_OpenCreateLocalUserDialog", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_OpenPushNotificationDialog(IContext context, pushnotifications.proxies.Device _device)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Device", _device == null ? null : _device.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_OpenPushNotificationDialog", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_RefreshDeviceList(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.IVK_RefreshDeviceList", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SaveAPNsSettingsAndEnableAPNs(IContext context, pushnotifications.proxies.APNSettings _aPNSettings)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("APNSettings", _aPNSettings == null ? null : _aPNSettings.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_SaveAPNsSettingsAndEnableAPNs", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SaveGCMSettingAndEnableGCM(IContext context, pushnotifications.proxies.GCMSettings _gCMSettings)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("GCMSettings", _gCMSettings == null ? null : _gCMSettings.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_SaveGCMSettingAndEnableGCM", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SaveNewLocalAccount(IContext context, myfirstmodule.proxies.LocalAccountInput _localAccountInput)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("LocalAccountInput", _localAccountInput == null ? null : _localAccountInput.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_SaveNewLocalAccount", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SendPushNotification(IContext context, myfirstmodule.proxies.PushNotificationInput _pushNotificationInput)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("PushNotificationInput", _pushNotificationInput == null ? null : _pushNotificationInput.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_SendPushNotification", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}
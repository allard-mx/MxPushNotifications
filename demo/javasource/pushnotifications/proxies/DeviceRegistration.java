// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package pushnotifications.proxies;

public class DeviceRegistration
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject deviceRegistrationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PushNotifications.DeviceRegistration";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DeviceID("DeviceID"),
		RegistrationID("RegistrationID"),
		DeviceType("DeviceType");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public DeviceRegistration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "PushNotifications.DeviceRegistration"));
	}

	protected DeviceRegistration(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject deviceRegistrationMendixObject)
	{
		if (deviceRegistrationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("PushNotifications.DeviceRegistration", deviceRegistrationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a PushNotifications.DeviceRegistration");

		this.deviceRegistrationMendixObject = deviceRegistrationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DeviceRegistration.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static pushnotifications.proxies.DeviceRegistration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return pushnotifications.proxies.DeviceRegistration.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static pushnotifications.proxies.DeviceRegistration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new pushnotifications.proxies.DeviceRegistration(context, mendixObject);
	}

	public static pushnotifications.proxies.DeviceRegistration load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return pushnotifications.proxies.DeviceRegistration.initialize(context, mendixObject);
	}

	public static java.util.List<pushnotifications.proxies.DeviceRegistration> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<pushnotifications.proxies.DeviceRegistration> result = new java.util.ArrayList<pushnotifications.proxies.DeviceRegistration>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//PushNotifications.DeviceRegistration" + xpathConstraint))
			result.add(pushnotifications.proxies.DeviceRegistration.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of DeviceID
	 */
	public final String getDeviceID()
	{
		return getDeviceID(getContext());
	}

	/**
	 * @param context
	 * @return value of DeviceID
	 */
	public final String getDeviceID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.DeviceID.toString());
	}

	/**
	 * Set value of DeviceID
	 * @param deviceid
	 */
	public final void setDeviceID(String deviceid)
	{
		setDeviceID(getContext(), deviceid);
	}

	/**
	 * Set value of DeviceID
	 * @param context
	 * @param deviceid
	 */
	public final void setDeviceID(com.mendix.systemwideinterfaces.core.IContext context, String deviceid)
	{
		getMendixObject().setValue(context, MemberNames.DeviceID.toString(), deviceid);
	}

	/**
	 * @return value of RegistrationID
	 */
	public final String getRegistrationID()
	{
		return getRegistrationID(getContext());
	}

	/**
	 * @param context
	 * @return value of RegistrationID
	 */
	public final String getRegistrationID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.RegistrationID.toString());
	}

	/**
	 * Set value of RegistrationID
	 * @param registrationid
	 */
	public final void setRegistrationID(String registrationid)
	{
		setRegistrationID(getContext(), registrationid);
	}

	/**
	 * Set value of RegistrationID
	 * @param context
	 * @param registrationid
	 */
	public final void setRegistrationID(com.mendix.systemwideinterfaces.core.IContext context, String registrationid)
	{
		getMendixObject().setValue(context, MemberNames.RegistrationID.toString(), registrationid);
	}

	/**
	 * Set value of DeviceType
	 * @param devicetype
	 */
	public final pushnotifications.proxies.DeviceType getDeviceType()
	{
		return getDeviceType(getContext());
	}

	/**
	 * @param context
	 * @return value of DeviceType
	 */
	public final pushnotifications.proxies.DeviceType getDeviceType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.DeviceType.toString());
		if (obj == null)
			return null;

		return pushnotifications.proxies.DeviceType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of DeviceType
	 * @param devicetype
	 */
	public final void setDeviceType(pushnotifications.proxies.DeviceType devicetype)
	{
		setDeviceType(getContext(), devicetype);
	}

	/**
	 * Set value of DeviceType
	 * @param context
	 * @param devicetype
	 */
	public final void setDeviceType(com.mendix.systemwideinterfaces.core.IContext context, pushnotifications.proxies.DeviceType devicetype)
	{
		if (devicetype != null)
			getMendixObject().setValue(context, MemberNames.DeviceType.toString(), devicetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.DeviceType.toString(), null);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return deviceRegistrationMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final pushnotifications.proxies.DeviceRegistration that = (pushnotifications.proxies.DeviceRegistration) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "PushNotifications.DeviceRegistration";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
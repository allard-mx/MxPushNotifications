// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package pushnotifications.proxies;

/**
 * 
 */
public class AppleMessage extends pushnotifications.proxies.Message
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PushNotifications.AppleMessage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Sound("Sound"),
		Badge("Badge"),
		ActionKey("ActionKey"),
		LaunchImage("LaunchImage"),
		LocalizedKey("LocalizedKey"),
		ResizeAlertBodyPostfix("ResizeAlertBodyPostfix"),
		DeviceType("DeviceType"),
		To("To"),
		MessageId("MessageId"),
		Message("Message"),
		Failed("Failed"),
		FailedReason("FailedReason"),
		FailedCount("FailedCount"),
		NextTry("NextTry"),
		Queued("Queued");

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

	public AppleMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "PushNotifications.AppleMessage"));
	}

	protected AppleMessage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject appleMessageMendixObject)
	{
		super(context, appleMessageMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("PushNotifications.AppleMessage", appleMessageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a PushNotifications.AppleMessage");
	}

	/**
	 * @deprecated Use 'AppleMessage.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static pushnotifications.proxies.AppleMessage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return pushnotifications.proxies.AppleMessage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static pushnotifications.proxies.AppleMessage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new pushnotifications.proxies.AppleMessage(context, mendixObject);
	}

	public static pushnotifications.proxies.AppleMessage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return pushnotifications.proxies.AppleMessage.initialize(context, mendixObject);
	}

	public static java.util.List<pushnotifications.proxies.AppleMessage> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<pushnotifications.proxies.AppleMessage> result = new java.util.ArrayList<pushnotifications.proxies.AppleMessage>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//PushNotifications.AppleMessage" + xpathConstraint))
			result.add(pushnotifications.proxies.AppleMessage.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Sound
	 */
	public final String getSound()
	{
		return getSound(getContext());
	}

	/**
	 * @param context
	 * @return value of Sound
	 */
	public final String getSound(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Sound.toString());
	}

	/**
	 * Set value of Sound
	 * @param sound
	 */
	public final void setSound(String sound)
	{
		setSound(getContext(), sound);
	}

	/**
	 * Set value of Sound
	 * @param context
	 * @param sound
	 */
	public final void setSound(com.mendix.systemwideinterfaces.core.IContext context, String sound)
	{
		getMendixObject().setValue(context, MemberNames.Sound.toString(), sound);
	}

	/**
	 * @return value of Badge
	 */
	public final Integer getBadge()
	{
		return getBadge(getContext());
	}

	/**
	 * @param context
	 * @return value of Badge
	 */
	public final Integer getBadge(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Badge.toString());
	}

	/**
	 * Set value of Badge
	 * @param badge
	 */
	public final void setBadge(Integer badge)
	{
		setBadge(getContext(), badge);
	}

	/**
	 * Set value of Badge
	 * @param context
	 * @param badge
	 */
	public final void setBadge(com.mendix.systemwideinterfaces.core.IContext context, Integer badge)
	{
		getMendixObject().setValue(context, MemberNames.Badge.toString(), badge);
	}

	/**
	 * @return value of ActionKey
	 */
	public final String getActionKey()
	{
		return getActionKey(getContext());
	}

	/**
	 * @param context
	 * @return value of ActionKey
	 */
	public final String getActionKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ActionKey.toString());
	}

	/**
	 * Set value of ActionKey
	 * @param actionkey
	 */
	public final void setActionKey(String actionkey)
	{
		setActionKey(getContext(), actionkey);
	}

	/**
	 * Set value of ActionKey
	 * @param context
	 * @param actionkey
	 */
	public final void setActionKey(com.mendix.systemwideinterfaces.core.IContext context, String actionkey)
	{
		getMendixObject().setValue(context, MemberNames.ActionKey.toString(), actionkey);
	}

	/**
	 * @return value of LaunchImage
	 */
	public final String getLaunchImage()
	{
		return getLaunchImage(getContext());
	}

	/**
	 * @param context
	 * @return value of LaunchImage
	 */
	public final String getLaunchImage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.LaunchImage.toString());
	}

	/**
	 * Set value of LaunchImage
	 * @param launchimage
	 */
	public final void setLaunchImage(String launchimage)
	{
		setLaunchImage(getContext(), launchimage);
	}

	/**
	 * Set value of LaunchImage
	 * @param context
	 * @param launchimage
	 */
	public final void setLaunchImage(com.mendix.systemwideinterfaces.core.IContext context, String launchimage)
	{
		getMendixObject().setValue(context, MemberNames.LaunchImage.toString(), launchimage);
	}

	/**
	 * @return value of LocalizedKey
	 */
	public final String getLocalizedKey()
	{
		return getLocalizedKey(getContext());
	}

	/**
	 * @param context
	 * @return value of LocalizedKey
	 */
	public final String getLocalizedKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.LocalizedKey.toString());
	}

	/**
	 * Set value of LocalizedKey
	 * @param localizedkey
	 */
	public final void setLocalizedKey(String localizedkey)
	{
		setLocalizedKey(getContext(), localizedkey);
	}

	/**
	 * Set value of LocalizedKey
	 * @param context
	 * @param localizedkey
	 */
	public final void setLocalizedKey(com.mendix.systemwideinterfaces.core.IContext context, String localizedkey)
	{
		getMendixObject().setValue(context, MemberNames.LocalizedKey.toString(), localizedkey);
	}

	/**
	 * @return value of ResizeAlertBodyPostfix
	 */
	public final String getResizeAlertBodyPostfix()
	{
		return getResizeAlertBodyPostfix(getContext());
	}

	/**
	 * @param context
	 * @return value of ResizeAlertBodyPostfix
	 */
	public final String getResizeAlertBodyPostfix(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ResizeAlertBodyPostfix.toString());
	}

	/**
	 * Set value of ResizeAlertBodyPostfix
	 * @param resizealertbodypostfix
	 */
	public final void setResizeAlertBodyPostfix(String resizealertbodypostfix)
	{
		setResizeAlertBodyPostfix(getContext(), resizealertbodypostfix);
	}

	/**
	 * Set value of ResizeAlertBodyPostfix
	 * @param context
	 * @param resizealertbodypostfix
	 */
	public final void setResizeAlertBodyPostfix(com.mendix.systemwideinterfaces.core.IContext context, String resizealertbodypostfix)
	{
		getMendixObject().setValue(context, MemberNames.ResizeAlertBodyPostfix.toString(), resizealertbodypostfix);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final pushnotifications.proxies.AppleMessage that = (pushnotifications.proxies.AppleMessage) obj;
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
		return "PushNotifications.AppleMessage";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

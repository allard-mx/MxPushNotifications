// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package pushnotifications.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class WindowsMessage extends pushnotifications.proxies.Message
{
	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "PushNotifications.WindowsMessage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Title("Title"),
		URL("URL"),
		DeviceType("DeviceType"),
		To("To"),
		MessageId("MessageId"),
		Message("Message"),
		Failed("Failed"),
		FailedReason("FailedReason"),
		FailedCount("FailedCount"),
		NextTry("NextTry"),
		Queued("Queued");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public WindowsMessage(IContext context)
	{
		this(context, Core.instantiate(context, "PushNotifications.WindowsMessage"));
	}

	protected WindowsMessage(IContext context, IMendixObject windowsMessageMendixObject)
	{
		super(context, windowsMessageMendixObject);
		if (!Core.isSubClassOf("PushNotifications.WindowsMessage", windowsMessageMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a PushNotifications.WindowsMessage");
	}

	/**
	 * @deprecated Use 'WindowsMessage.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static pushnotifications.proxies.WindowsMessage initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return pushnotifications.proxies.WindowsMessage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static pushnotifications.proxies.WindowsMessage initialize(IContext context, IMendixObject mendixObject)
	{
		return new pushnotifications.proxies.WindowsMessage(context, mendixObject);
	}

	public static pushnotifications.proxies.WindowsMessage load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return pushnotifications.proxies.WindowsMessage.initialize(context, mendixObject);
	}

	public static java.util.List<pushnotifications.proxies.WindowsMessage> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<pushnotifications.proxies.WindowsMessage> result = new java.util.ArrayList<pushnotifications.proxies.WindowsMessage>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//PushNotifications.WindowsMessage" + xpathConstraint))
			result.add(pushnotifications.proxies.WindowsMessage.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Title
	 */
	public final String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final String getTitle(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(IContext context, String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of URL
	 */
	public final String getURL()
	{
		return getURL(getContext());
	}

	/**
	 * @param context
	 * @return value of URL
	 */
	public final String getURL(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.URL.toString());
	}

	/**
	 * Set value of URL
	 * @param url
	 */
	public final void setURL(String url)
	{
		setURL(getContext(), url);
	}

	/**
	 * Set value of URL
	 * @param context
	 * @param url
	 */
	public final void setURL(IContext context, String url)
	{
		getMendixObject().setValue(context, MemberNames.URL.toString(), url);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final pushnotifications.proxies.WindowsMessage that = (pushnotifications.proxies.WindowsMessage) obj;
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
	public static String getType()
	{
		return "PushNotifications.WindowsMessage";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

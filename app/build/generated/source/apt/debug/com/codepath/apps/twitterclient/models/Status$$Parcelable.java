
package com.codepath.apps.twitterclient.models;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-03-12T23:11+0800")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Status$$Parcelable
    implements Parcelable, ParcelWrapper<com.codepath.apps.twitterclient.models.Status>
{

    private com.codepath.apps.twitterclient.models.Status status$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Status$$Parcelable>CREATOR = new Creator<Status$$Parcelable>() {


        @Override
        public Status$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Status$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Status$$Parcelable[] newArray(int size) {
            return new Status$$Parcelable[size] ;
        }

    }
    ;

    public Status$$Parcelable(com.codepath.apps.twitterclient.models.Status status$$2) {
        status$$0 = status$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(status$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.codepath.apps.twitterclient.models.Status status$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(status$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(status$$1));
            parcel$$1 .writeString(status$$1 .idStr);
            if (status$$1 .inReplyToUserId == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeLong(status$$1 .inReplyToUserId);
            }
            com.codepath.apps.twitterclient.models.Coordinates$$Parcelable.write(status$$1 .coordinates, parcel$$1, flags$$0, identityMap$$0);
            if (status$$1 .truncated == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((status$$1 .truncated? 1 : 0));
            }
            parcel$$1 .writeString(status$$1 .source);
            if (status$$1 .retweeted == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((status$$1 .retweeted? 1 : 0));
            }
            com.codepath.apps.twitterclient.models.Geo$$Parcelable.write(status$$1 .geo, parcel$$1, flags$$0, identityMap$$0);
            parcel$$1 .writeString(status$$1 .createdAt);
            parcel$$1 .writeString(status$$1 .inReplyToScreenName);
            if (status$$1 .inReplyToStatusId == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeLong(status$$1 .inReplyToStatusId);
            }
            parcel$$1 .writeString(status$$1 .inReplyToStatusIdStr);
            if (status$$1 .id == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeLong(status$$1 .id);
            }
            com.codepath.apps.twitterclient.models.Place$$Parcelable.write(status$$1 .place, parcel$$1, flags$$0, identityMap$$0);
            parcel$$1 .writeString(status$$1 .text);
            parcel$$1 .writeString(status$$1 .inReplyToUserIdStr);
            if (status$$1 .retweetCount == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt(status$$1 .retweetCount);
            }
            if (status$$1 .favorited == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((status$$1 .favorited? 1 : 0));
            }
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.codepath.apps.twitterclient.models.Status getParcel() {
        return status$$0;
    }

    public static com.codepath.apps.twitterclient.models.Status read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.codepath.apps.twitterclient.models.Status status$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            status$$4 = new com.codepath.apps.twitterclient.models.Status();
            identityMap$$1 .put(reservation$$0, status$$4);
            status$$4 .idStr = parcel$$3 .readString();
            int int$$0 = parcel$$3 .readInt();
            java.lang.Long long$$0;
            if (int$$0 < 0) {
                long$$0 = null;
            } else {
                long$$0 = parcel$$3 .readLong();
            }
            status$$4 .inReplyToUserId = long$$0;
            Coordinates coordinates$$0 = com.codepath.apps.twitterclient.models.Coordinates$$Parcelable.read(parcel$$3, identityMap$$1);
            status$$4 .coordinates = coordinates$$0;
            int int$$1 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$0;
            if (int$$1 < 0) {
                boolean$$0 = null;
            } else {
                boolean$$0 = (parcel$$3 .readInt() == 1);
            }
            status$$4 .truncated = boolean$$0;
            status$$4 .source = parcel$$3 .readString();
            int int$$2 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$1;
            if (int$$2 < 0) {
                boolean$$1 = null;
            } else {
                boolean$$1 = (parcel$$3 .readInt() == 1);
            }
            status$$4 .retweeted = boolean$$1;
            Geo geo$$0 = com.codepath.apps.twitterclient.models.Geo$$Parcelable.read(parcel$$3, identityMap$$1);
            status$$4 .geo = geo$$0;
            status$$4 .createdAt = parcel$$3 .readString();
            status$$4 .inReplyToScreenName = parcel$$3 .readString();
            int int$$3 = parcel$$3 .readInt();
            java.lang.Long long$$1;
            if (int$$3 < 0) {
                long$$1 = null;
            } else {
                long$$1 = parcel$$3 .readLong();
            }
            status$$4 .inReplyToStatusId = long$$1;
            status$$4 .inReplyToStatusIdStr = parcel$$3 .readString();
            int int$$4 = parcel$$3 .readInt();
            java.lang.Long long$$2;
            if (int$$4 < 0) {
                long$$2 = null;
            } else {
                long$$2 = parcel$$3 .readLong();
            }
            status$$4 .id = long$$2;
            Place place$$0 = com.codepath.apps.twitterclient.models.Place$$Parcelable.read(parcel$$3, identityMap$$1);
            status$$4 .place = place$$0;
            status$$4 .text = parcel$$3 .readString();
            status$$4 .inReplyToUserIdStr = parcel$$3 .readString();
            int int$$5 = parcel$$3 .readInt();
            Integer integer$$0;
            if (int$$5 < 0) {
                integer$$0 = null;
            } else {
                integer$$0 = parcel$$3 .readInt();
            }
            status$$4 .retweetCount = integer$$0;
            int int$$6 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$2;
            if (int$$6 < 0) {
                boolean$$2 = null;
            } else {
                boolean$$2 = (parcel$$3 .readInt() == 1);
            }
            status$$4 .favorited = boolean$$2;
            com.codepath.apps.twitterclient.models.Status status$$3 = status$$4;
            identityMap$$1 .put(identity$$1, status$$3);
            return status$$3;
        }
    }

}

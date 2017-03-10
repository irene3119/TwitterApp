
package com.codepath.apps.twitterclient.models;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-03-10T23:53+0800")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class UserMention$$Parcelable
    implements Parcelable, ParcelWrapper<com.codepath.apps.twitterclient.models.UserMention>
{

    private com.codepath.apps.twitterclient.models.UserMention userMention$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<UserMention$$Parcelable>CREATOR = new Creator<UserMention$$Parcelable>() {


        @Override
        public UserMention$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new UserMention$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public UserMention$$Parcelable[] newArray(int size) {
            return new UserMention$$Parcelable[size] ;
        }

    }
    ;

    public UserMention$$Parcelable(com.codepath.apps.twitterclient.models.UserMention userMention$$2) {
        userMention$$0 = userMention$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(userMention$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.codepath.apps.twitterclient.models.UserMention userMention$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(userMention$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(userMention$$1));
            parcel$$1 .writeString(userMention$$1 .idStr);
            if (userMention$$1 .indices == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(userMention$$1 .indices.size());
                for (java.lang.Integer integer$$0 : ((List<java.lang.Integer> ) userMention$$1 .indices)) {
                    if (integer$$0 == null) {
                        parcel$$1 .writeInt(-1);
                    } else {
                        parcel$$1 .writeInt(1);
                        parcel$$1 .writeInt(integer$$0);
                    }
                }
            }
            parcel$$1 .writeString(userMention$$1 .name);
            if (userMention$$1 .id == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeLong(userMention$$1 .id);
            }
            parcel$$1 .writeString(userMention$$1 .screenName);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.codepath.apps.twitterclient.models.UserMention getParcel() {
        return userMention$$0;
    }

    public static com.codepath.apps.twitterclient.models.UserMention read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.codepath.apps.twitterclient.models.UserMention userMention$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            userMention$$4 = new com.codepath.apps.twitterclient.models.UserMention();
            identityMap$$1 .put(reservation$$0, userMention$$4);
            userMention$$4 .idStr = parcel$$3 .readString();
            int int$$0 = parcel$$3 .readInt();
            ArrayList<java.lang.Integer> list$$0;
            if (int$$0 < 0) {
                list$$0 = null;
            } else {
                list$$0 = new ArrayList<java.lang.Integer>(int$$0);
                for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                    int int$$2 = parcel$$3 .readInt();
                    java.lang.Integer integer$$1;
                    if (int$$2 < 0) {
                        integer$$1 = null;
                    } else {
                        integer$$1 = parcel$$3 .readInt();
                    }
                    list$$0 .add(integer$$1);
                }
            }
            userMention$$4 .indices = list$$0;
            userMention$$4 .name = parcel$$3 .readString();
            int int$$3 = parcel$$3 .readInt();
            Long long$$0;
            if (int$$3 < 0) {
                long$$0 = null;
            } else {
                long$$0 = parcel$$3 .readLong();
            }
            userMention$$4 .id = long$$0;
            userMention$$4 .screenName = parcel$$3 .readString();
            com.codepath.apps.twitterclient.models.UserMention userMention$$3 = userMention$$4;
            identityMap$$1 .put(identity$$1, userMention$$3);
            return userMention$$3;
        }
    }

}

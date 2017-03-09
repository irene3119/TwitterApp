
package com.codepath.apps.twitterclient.models;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-03-10T01:16+0800")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class UserCredential$$Parcelable
    implements Parcelable, ParcelWrapper<com.codepath.apps.twitterclient.models.UserCredential>
{

    private com.codepath.apps.twitterclient.models.UserCredential userCredential$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<UserCredential$$Parcelable>CREATOR = new Creator<UserCredential$$Parcelable>() {


        @Override
        public UserCredential$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new UserCredential$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public UserCredential$$Parcelable[] newArray(int size) {
            return new UserCredential$$Parcelable[size] ;
        }

    }
    ;

    public UserCredential$$Parcelable(com.codepath.apps.twitterclient.models.UserCredential userCredential$$2) {
        userCredential$$0 = userCredential$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(userCredential$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.codepath.apps.twitterclient.models.UserCredential userCredential$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(userCredential$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(userCredential$$1));
            if (userCredential$$1 .showAllInlineMedia == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((userCredential$$1 .showAllInlineMedia? 1 : 0));
            }
            if (userCredential$$1 .geoEnabled == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((userCredential$$1 .geoEnabled? 1 : 0));
            }
            parcel$$1 .writeString(userCredential$$1 .description);
            parcel$$1 .writeString(userCredential$$1 .profileTextColor);
            if (userCredential$$1 .contributorsEnabled == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((userCredential$$1 .contributorsEnabled? 1 : 0));
            }
            parcel$$1 .writeString(userCredential$$1 .screenName);
            if (userCredential$$1 .profileUseBackgroundImage == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((userCredential$$1 .profileUseBackgroundImage? 1 : 0));
            }
            parcel$$1 .writeString(userCredential$$1 .createdAt);
            parcel$$1 .writeString(userCredential$$1 .profileBackgroundImageUrl);
            if (userCredential$$1 ._protected == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((userCredential$$1 ._protected? 1 : 0));
            }
            if (userCredential$$1 .id == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeLong(userCredential$$1 .id);
            }
            parcel$$1 .writeString(userCredential$$1 .lang);
            parcel$$1 .writeString(userCredential$$1 .profileImageUrl);
            if (userCredential$$1 .defaultProfileImage == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((userCredential$$1 .defaultProfileImage? 1 : 0));
            }
            parcel$$1 .writeString(userCredential$$1 .idStr);
            parcel$$1 .writeString(userCredential$$1 .profileSidebarBorderColor);
            if (userCredential$$1 .statusesCount == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt(userCredential$$1 .statusesCount);
            }
            if (userCredential$$1 .utcOffset == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt(userCredential$$1 .utcOffset);
            }
            if (userCredential$$1 .profileBackgroundTile == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((userCredential$$1 .profileBackgroundTile? 1 : 0));
            }
            parcel$$1 .writeString(userCredential$$1 .profileBackgroundImageUrlHttps);
            parcel$$1 .writeString(userCredential$$1 .profileBackgroundColor);
            if (userCredential$$1 .verified == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((userCredential$$1 .verified? 1 : 0));
            }
            if (userCredential$$1 .favouritesCount == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt(userCredential$$1 .favouritesCount);
            }
            parcel$$1 .writeString(userCredential$$1 .timeZone);
            if (userCredential$$1 .defaultProfile == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((userCredential$$1 .defaultProfile? 1 : 0));
            }
            if (userCredential$$1 .friendsCount == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt(userCredential$$1 .friendsCount);
            }
            parcel$$1 .writeString(userCredential$$1 .profileLinkColor);
            if (userCredential$$1 .isTranslator == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((userCredential$$1 .isTranslator? 1 : 0));
            }
            if (userCredential$$1 .listedCount == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt(userCredential$$1 .listedCount);
            }
            parcel$$1 .writeString(userCredential$$1 .profileBannerUrl);
            parcel$$1 .writeString(userCredential$$1 .url);
            parcel$$1 .writeString(userCredential$$1 .profileSidebarFillColor);
            parcel$$1 .writeString(userCredential$$1 .profileImageUrlHttps);
            parcel$$1 .writeString(userCredential$$1 .name);
            parcel$$1 .writeString(userCredential$$1 .location);
            if (userCredential$$1 .followersCount == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt(userCredential$$1 .followersCount);
            }
            com.codepath.apps.twitterclient.models.Status$$Parcelable.write(userCredential$$1 .status, parcel$$1, flags$$0, identityMap$$0);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.codepath.apps.twitterclient.models.UserCredential getParcel() {
        return userCredential$$0;
    }

    public static com.codepath.apps.twitterclient.models.UserCredential read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.codepath.apps.twitterclient.models.UserCredential userCredential$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            userCredential$$4 = new com.codepath.apps.twitterclient.models.UserCredential();
            identityMap$$1 .put(reservation$$0, userCredential$$4);
            int int$$0 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$0;
            if (int$$0 < 0) {
                boolean$$0 = null;
            } else {
                boolean$$0 = (parcel$$3 .readInt() == 1);
            }
            userCredential$$4 .showAllInlineMedia = boolean$$0;
            int int$$1 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$1;
            if (int$$1 < 0) {
                boolean$$1 = null;
            } else {
                boolean$$1 = (parcel$$3 .readInt() == 1);
            }
            userCredential$$4 .geoEnabled = boolean$$1;
            userCredential$$4 .description = parcel$$3 .readString();
            userCredential$$4 .profileTextColor = parcel$$3 .readString();
            int int$$2 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$2;
            if (int$$2 < 0) {
                boolean$$2 = null;
            } else {
                boolean$$2 = (parcel$$3 .readInt() == 1);
            }
            userCredential$$4 .contributorsEnabled = boolean$$2;
            userCredential$$4 .screenName = parcel$$3 .readString();
            int int$$3 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$3;
            if (int$$3 < 0) {
                boolean$$3 = null;
            } else {
                boolean$$3 = (parcel$$3 .readInt() == 1);
            }
            userCredential$$4 .profileUseBackgroundImage = boolean$$3;
            userCredential$$4 .createdAt = parcel$$3 .readString();
            userCredential$$4 .profileBackgroundImageUrl = parcel$$3 .readString();
            int int$$4 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$4;
            if (int$$4 < 0) {
                boolean$$4 = null;
            } else {
                boolean$$4 = (parcel$$3 .readInt() == 1);
            }
            userCredential$$4 ._protected = boolean$$4;
            int int$$5 = parcel$$3 .readInt();
            Long long$$0;
            if (int$$5 < 0) {
                long$$0 = null;
            } else {
                long$$0 = parcel$$3 .readLong();
            }
            userCredential$$4 .id = long$$0;
            userCredential$$4 .lang = parcel$$3 .readString();
            userCredential$$4 .profileImageUrl = parcel$$3 .readString();
            int int$$6 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$5;
            if (int$$6 < 0) {
                boolean$$5 = null;
            } else {
                boolean$$5 = (parcel$$3 .readInt() == 1);
            }
            userCredential$$4 .defaultProfileImage = boolean$$5;
            userCredential$$4 .idStr = parcel$$3 .readString();
            userCredential$$4 .profileSidebarBorderColor = parcel$$3 .readString();
            int int$$7 = parcel$$3 .readInt();
            java.lang.Integer integer$$0;
            if (int$$7 < 0) {
                integer$$0 = null;
            } else {
                integer$$0 = parcel$$3 .readInt();
            }
            userCredential$$4 .statusesCount = integer$$0;
            int int$$8 = parcel$$3 .readInt();
            java.lang.Integer integer$$1;
            if (int$$8 < 0) {
                integer$$1 = null;
            } else {
                integer$$1 = parcel$$3 .readInt();
            }
            userCredential$$4 .utcOffset = integer$$1;
            int int$$9 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$6;
            if (int$$9 < 0) {
                boolean$$6 = null;
            } else {
                boolean$$6 = (parcel$$3 .readInt() == 1);
            }
            userCredential$$4 .profileBackgroundTile = boolean$$6;
            userCredential$$4 .profileBackgroundImageUrlHttps = parcel$$3 .readString();
            userCredential$$4 .profileBackgroundColor = parcel$$3 .readString();
            int int$$10 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$7;
            if (int$$10 < 0) {
                boolean$$7 = null;
            } else {
                boolean$$7 = (parcel$$3 .readInt() == 1);
            }
            userCredential$$4 .verified = boolean$$7;
            int int$$11 = parcel$$3 .readInt();
            java.lang.Integer integer$$2;
            if (int$$11 < 0) {
                integer$$2 = null;
            } else {
                integer$$2 = parcel$$3 .readInt();
            }
            userCredential$$4 .favouritesCount = integer$$2;
            userCredential$$4 .timeZone = parcel$$3 .readString();
            int int$$12 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$8;
            if (int$$12 < 0) {
                boolean$$8 = null;
            } else {
                boolean$$8 = (parcel$$3 .readInt() == 1);
            }
            userCredential$$4 .defaultProfile = boolean$$8;
            int int$$13 = parcel$$3 .readInt();
            java.lang.Integer integer$$3;
            if (int$$13 < 0) {
                integer$$3 = null;
            } else {
                integer$$3 = parcel$$3 .readInt();
            }
            userCredential$$4 .friendsCount = integer$$3;
            userCredential$$4 .profileLinkColor = parcel$$3 .readString();
            int int$$14 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$9;
            if (int$$14 < 0) {
                boolean$$9 = null;
            } else {
                boolean$$9 = (parcel$$3 .readInt() == 1);
            }
            userCredential$$4 .isTranslator = boolean$$9;
            int int$$15 = parcel$$3 .readInt();
            java.lang.Integer integer$$4;
            if (int$$15 < 0) {
                integer$$4 = null;
            } else {
                integer$$4 = parcel$$3 .readInt();
            }
            userCredential$$4 .listedCount = integer$$4;
            userCredential$$4 .profileBannerUrl = parcel$$3 .readString();
            userCredential$$4 .url = parcel$$3 .readString();
            userCredential$$4 .profileSidebarFillColor = parcel$$3 .readString();
            userCredential$$4 .profileImageUrlHttps = parcel$$3 .readString();
            userCredential$$4 .name = parcel$$3 .readString();
            userCredential$$4 .location = parcel$$3 .readString();
            int int$$16 = parcel$$3 .readInt();
            java.lang.Integer integer$$5;
            if (int$$16 < 0) {
                integer$$5 = null;
            } else {
                integer$$5 = parcel$$3 .readInt();
            }
            userCredential$$4 .followersCount = integer$$5;
            Status status$$0 = com.codepath.apps.twitterclient.models.Status$$Parcelable.read(parcel$$3, identityMap$$1);
            userCredential$$4 .status = status$$0;
            com.codepath.apps.twitterclient.models.UserCredential userCredential$$3 = userCredential$$4;
            identityMap$$1 .put(identity$$1, userCredential$$3);
            return userCredential$$3;
        }
    }

}

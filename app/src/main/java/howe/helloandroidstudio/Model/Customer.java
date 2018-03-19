package howe.helloandroidstudio.Model;

/**
 * Created by Howe on 2017-02-28.
 */

public class Customer implements java.io.Serializable
{
    /**
     * 版本号
     */
    private static final long serialVersionUID = -6834168385782693557L;

    /**
     * ID
     * @Column(name = "ID", nullable = false, length = 16)
     */
    private String ID;

    /**
     * 获取ID*
     * @returnID
     */
    public String getID(){
        return this.ID;
    }

    /**
     * 设置ID*
     * @paramID
     *          ID
     */
    public void setID(String ID)
    {
        this.ID = ID;
    }

    /**
     * Code
     * @Column(name = "Code", nullable = false, length = 20)
     */
    private String Code;

    /**
     * 获取Code*
     * @returnCode
     */
    public String getCode(){
        return this.Code;
    }

    /**
     * 设置Code*
     * @paramCode
     *          Code
     */
    public void setCode(String Code)
    {
        this.Code = Code;
    }

    /**
     * Name
     * @Column(name = "Name", nullable = false, length = 1000)
     */
    private String Name;

    /**
     * 获取Name*
     * @returnName
     */
    public String getName(){
        return this.Name;
    }

    /**
     * 设置Name*
     * @paramName
     *          Name
     */
    public void setName(String Name)
    {
        this.Name = Name;
    }

    /**
     * Alias
     * @Column(name = "Alias", nullable = false, length = 100)
     */
    private String Alias;

    /**
     * 获取Alias*
     * @returnAlias
     */
    public String getAlias(){
        return this.Alias;
    }

    /**
     * 设置Alias*
     * @paramAlias
     *          Alias
     */
    public void setAlias(String Alias)
    {
        this.Alias = Alias;
    }

    /**
     * CategoryID
     * @Column(name = "CategoryID", nullable = false, length = 16)
     */
    private String CategoryID;

    /**
     * 获取CategoryID*
     * @returnCategoryID
     */
    public String getCategoryID(){
        return this.CategoryID;
    }

    /**
     * 设置CategoryID*
     * @paramCategoryID
     *          CategoryID
     */
    public void setCategoryID(String CategoryID)
    {
        this.CategoryID = CategoryID;
    }

    /**
     * ParentID
     * @Column(name = "ParentID", nullable = true, length = 16)
     */
    private String ParentID;

    /**
     * 获取ParentID*
     * @returnParentID
     */
    public String getParentID(){
        return this.ParentID;
    }

    /**
     * 设置ParentID*
     * @paramParentID
     *          ParentID
     */
    public void setParentID(String ParentID)
    {
        this.ParentID = ParentID;
    }

    /**
     * RegionID
     * @Column(name = "RegionID", nullable = false, length = 16)
     */
    private String RegionID;

    /**
     * 获取RegionID*
     * @returnRegionID
     */
    public String getRegionID(){
        return this.RegionID;
    }

    /**
     * 设置RegionID*
     * @paramRegionID
     *          RegionID
     */
    public void setRegionID(String RegionID)
    {
        this.RegionID = RegionID;
    }

    /**
     * LocationID
     * @Column(name = "LocationID", nullable = false, length = 16)
     */
    private String LocationID;

    /**
     * 获取LocationID*
     * @returnLocationID
     */
    public String getLocationID(){
        return this.LocationID;
    }

    /**
     * 设置LocationID*
     * @paramLocationID
     *          LocationID
     */
    public void setLocationID(String LocationID)
    {
        this.LocationID = LocationID;
    }

    /**
     * Address
     * @Column(name = "Address", nullable = false, length = 200)
     */
    private String Address;

    /**
     * 获取Address*
     * @returnAddress
     */
    public String getAddress(){
        return this.Address;
    }

    /**
     * 设置Address*
     * @paramAddress
     *          Address
     */
    public void setAddress(String Address)
    {
        this.Address = Address;
    }

    /**
     * ShipToAddrress
     * @Column(name = "ShipToAddrress", nullable = true, length = 200)
     */
    private String ShipToAddrress;

    /**
     * 获取ShipToAddrress*
     * @returnShipToAddrress
     */
    public String getShipToAddrress(){
        return this.ShipToAddrress;
    }

    /**
     * 设置ShipToAddrress*
     * @paramShipToAddrress
     *          ShipToAddrress
     */
    public void setShipToAddrress(String ShipToAddrress)
    {
        this.ShipToAddrress = ShipToAddrress;
    }

    /**
     * Longitude
     * @Column(name = "Longitude", nullable = true, length = 50)
     */
    private String Longitude;

    /**
     * 获取Longitude*
     * @returnLongitude
     */
    public String getLongitude(){
        return this.Longitude;
    }

    /**
     * 设置Longitude*
     * @paramLongitude
     *          Longitude
     */
    public void setLongitude(String Longitude)
    {
        this.Longitude = Longitude;
    }

    /**
     * Latitude
     * @Column(name = "Latitude", nullable = true, length = 50)
     */
    private String Latitude;

    /**
     * 获取Latitude*
     * @returnLatitude
     */
    public String getLatitude(){
        return this.Latitude;
    }

    /**
     * 设置Latitude*
     * @paramLatitude
     *          Latitude
     */
    public void setLatitude(String Latitude)
    {
        this.Latitude = Latitude;
    }

    /**
     * Contact
     * @Column(name = "Contact", nullable = false, length = 100)
     */
    private String Contact;

    /**
     * 获取Contact*
     * @returnContact
     */
    public String getContact(){
        return this.Contact;
    }

    /**
     * 设置Contact*
     * @paramContact
     *          Contact
     */
    public void setContact(String Contact)
    {
        this.Contact = Contact;
    }

    /**
     * ZipCode
     * @Column(name = "ZipCode", nullable = true, length = 10)
     */
    private String ZipCode;

    /**
     * 获取ZipCode*
     * @returnZipCode
     */
    public String getZipCode(){
        return this.ZipCode;
    }

    /**
     * 设置ZipCode*
     * @paramZipCode
     *          ZipCode
     */
    public void setZipCode(String ZipCode)
    {
        this.ZipCode = ZipCode;
    }

    /**
     * Phone
     * @Column(name = "Phone", nullable = true, length = 50)
     */
    private String Phone;

    /**
     * 获取Phone*
     * @returnPhone
     */
    public String getPhone(){
        return this.Phone;
    }

    /**
     * 设置Phone*
     * @paramPhone
     *          Phone
     */
    public void setPhone(String Phone)
    {
        this.Phone = Phone;
    }

    /**
     * Mobile
     * @Column(name = "Mobile", nullable = true, length = 50)
     */
    private String Mobile;

    /**
     * 获取Mobile*
     * @returnMobile
     */
    public String getMobile(){
        return this.Mobile;
    }

    /**
     * 设置Mobile*
     * @paramMobile
     *          Mobile
     */
    public void setMobile(String Mobile)
    {
        this.Mobile = Mobile;
    }

    /**
     * UpdatedUser
     * @Column(name = "UpdatedUser", nullable = false, length = 20)
     */
    private String UpdatedUser;

    /**
     * 获取UpdatedUser*
     * @returnUpdatedUser
     */
    public String getUpdatedUser(){
        return this.UpdatedUser;
    }

    /**
     * 设置UpdatedUser*
     * @paramUpdatedUser
     *          UpdatedUser
     */
    public void setUpdatedUser(String UpdatedUser)
    {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * UpdatedTime
     * @Column(name = "UpdatedTime", nullable = false, length = 8)
     */
    private java.util.Date UpdatedTime;

    /**
     * 获取UpdatedTime*
     * @returnUpdatedTime
     */
    public java.util.Date getUpdatedTime(){
        return this.UpdatedTime;
    }

    /**
     * 设置UpdatedTime*
     * @paramUpdatedTime
     *          UpdatedTime
     */
    public void setUpdatedTime(java.util.Date UpdatedTime)
    {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * IsActived
     * @Column(name = "IsActived", nullable = false, length = 1)
     */
    private java.lang.Boolean IsActived;

    /**
     * 获取IsActived*
     * @returnIsActived
     */
    public java.lang.Boolean getIsActived(){
        return this.IsActived;
    }

    /**
     * 设置IsActived*
     * @paramIsActived
     *          IsActived
     */
    public void setIsActived(java.lang.Boolean IsActived)
    {
        this.IsActived = IsActived;
    }

    /**
     * UseType
     * @Column(name = "UseType", nullable = false, length = 4)
     */
    private java.lang.Integer UseType;

    /**
     * 获取UseType*
     * @returnUseType
     */
    public java.lang.Integer getUseType(){
        return this.UseType;
    }

    /**
     * 设置UseType*
     * @paramUseType
     *          UseType
     */
    public void setUseType(java.lang.Integer UseType)
    {
        this.UseType = UseType;
    }

    /**
     * Market
     * @Column(name = "Market", nullable = true, length = 1000)
     */
    private String Market;

    /**
     * 获取Market*
     * @returnMarket
     */
    public String getMarket(){
        return this.Market;
    }

    /**
     * 设置Market*
     * @paramMarket
     *          Market
     */
    public void setMarket(String Market)
    {
        this.Market = Market;
    }

    /**
     * RecommendAddress
     * @Column(name = "RecommendAddress", nullable = true, length = 200)
     */
    private String RecommendAddress;

    /**
     * 获取RecommendAddress*
     * @returnRecommendAddress
     */
    public String getRecommendAddress(){
        return this.RecommendAddress;
    }

    /**
     * 设置RecommendAddress*
     * @paramRecommendAddress
     *          RecommendAddress
     */
    public void setRecommendAddress(String RecommendAddress)
    {
        this.RecommendAddress = RecommendAddress;
    }
}



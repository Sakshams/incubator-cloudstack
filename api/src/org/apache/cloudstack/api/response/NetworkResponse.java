// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package org.apache.cloudstack.api.response;

import java.util.List;

import com.cloud.network.Network;
import org.apache.cloudstack.api.ApiConstants;
import org.apache.cloudstack.api.BaseResponse;
import org.apache.cloudstack.api.EntityReference;
import com.cloud.projects.ProjectAccount;
import com.cloud.serializer.Param;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
@EntityReference(value = {Network.class, ProjectAccount.class})
public class NetworkResponse extends BaseResponse implements ControlledEntityResponse{

    @SerializedName(ApiConstants.ID) @Param(description="the id of the network")
    private String id;

    @SerializedName(ApiConstants.NAME) @Param(description="the name of the network")
    private String name;

    @SerializedName(ApiConstants.DISPLAY_TEXT) @Param(description="the displaytext of the network")
    private String displaytext;

    @SerializedName("broadcastdomaintype") @Param(description="Broadcast domain type of the network")
    private String broadcastDomainType;

    @SerializedName(ApiConstants.TRAFFIC_TYPE) @Param(description="the traffic type of the network")
    private String trafficType;

    @SerializedName(ApiConstants.GATEWAY) @Param(description="the network's gateway")
    private String gateway;

    @SerializedName(ApiConstants.NETMASK) @Param(description="the network's netmask")
    private String netmask;

    @SerializedName(ApiConstants.CIDR) @Param(description="the cidr the network")
    private String cidr;

    @SerializedName(ApiConstants.ZONE_ID) @Param(description="zone id of the network")
    private String zoneId;

    @SerializedName(ApiConstants.ZONE_NAME) @Param(description="the name of the zone the network belongs to")
    private String zoneName;

    @SerializedName("networkofferingid") @Param(description="network offering id the network is created from")
    private String networkOfferingId;

    @SerializedName("networkofferingname") @Param(description="name of the network offering the network is created from")
    private String networkOfferingName;

    @SerializedName("networkofferingdisplaytext") @Param(description="display text of the network offering the network is created from")
    private String networkOfferingDisplayText;

    @SerializedName("networkofferingavailability") @Param(description="availability of the network offering the network is created from")
    private String networkOfferingAvailability;

    @SerializedName(ApiConstants.IS_SYSTEM) @Param(description="true if network is system, false otherwise")
    private Boolean isSystem;

    @SerializedName(ApiConstants.STATE) @Param(description="state of the network")
    private String state;

    @SerializedName("related") @Param(description="related to what other network configuration")
    private String related;

    @SerializedName("broadcasturi") @Param(description="broadcast uri of the network. This parameter is visible to ROOT admins only")
    private String broadcastUri;

    @SerializedName(ApiConstants.DNS1) @Param(description="the first DNS for the network")
    private String dns1;

    @SerializedName(ApiConstants.DNS2) @Param(description="the second DNS for the network")
    private String dns2;

    @SerializedName(ApiConstants.TYPE) @Param(description="the type of the network")
    private String type;

    @SerializedName(ApiConstants.VLAN) @Param(description="The vlan of the network. This parameter is visible to ROOT admins only")
    private String vlan;

    @SerializedName(ApiConstants.ACL_TYPE) @Param(description="acl type - access type to the network")
    private String aclType;

    @SerializedName(ApiConstants.SUBDOMAIN_ACCESS) @Param(description="true if users from subdomains can access the domain level network")
    private Boolean subdomainAccess;

    @SerializedName(ApiConstants.ACCOUNT) @Param(description="the owner of the network")
    private String accountName;

    @SerializedName(ApiConstants.PROJECT_ID) @Param(description="the project id of the ipaddress")
    private String projectId;

    @SerializedName(ApiConstants.PROJECT) @Param(description="the project name of the address")
    private String projectName;

    @SerializedName(ApiConstants.DOMAIN_ID) @Param(description="the domain id of the network owner")
    private String domainId;

    @SerializedName(ApiConstants.DOMAIN) @Param(description="the domain name of the network owner")
    private String domain;

    @SerializedName("isdefault") @Param(description="true if network is default, false otherwise")
    private Boolean isDefault;

    @SerializedName("service") @Param(description="the list of services", responseObject = ServiceResponse.class)
    private List<ServiceResponse> services;

    @SerializedName(ApiConstants.NETWORK_DOMAIN) @Param(description="the network domain")
    private String networkDomain;

    @SerializedName(ApiConstants.PHYSICAL_NETWORK_ID) @Param(description="the physical network id")
    private String physicalNetworkId;

    @SerializedName(ApiConstants.RESTART_REQUIRED) @Param(description="true network requires restart")
    private Boolean restartRequired;

    @SerializedName(ApiConstants.SPECIFY_IP_RANGES) @Param(description="true if network supports specifying ip ranges, false otherwise")
    private Boolean specifyIpRanges;

    @SerializedName(ApiConstants.VPC_ID) @Param(description="VPC the network belongs to")
    private String vpcId;

    @SerializedName(ApiConstants.CAN_USE_FOR_DEPLOY) @Param(description="list networks available for vm deployment")
    private Boolean canUseForDeploy;

    @SerializedName(ApiConstants.TAGS)  @Param(description="the list of resource tags associated with network", responseObject = ResourceTagResponse.class)
    private List<ResourceTagResponse> tags;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBroadcastDomainType(String broadcastDomainType) {
        this.broadcastDomainType = broadcastDomainType;
    }

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public void setNetworkOfferingId(String networkOfferingId) {
        this.networkOfferingId = networkOfferingId;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setRelated(String related) {
        this.related = related;
    }

    public void setBroadcastUri(String broadcastUri) {
        this.broadcastUri = broadcastUri;
    }

    public void setDns1(String dns1) {
        this.dns1 = dns1;
    }

    public void setDns2(String dns2) {
        this.dns2 = dns2;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public void setNetworkOfferingName(String networkOfferingName) {
        this.networkOfferingName = networkOfferingName;
    }

    public void setNetworkOfferingDisplayText(String networkOfferingDisplayText) {
        this.networkOfferingDisplayText = networkOfferingDisplayText;
    }

    public void setDisplaytext(String displaytext) {
        this.displaytext = displaytext;
    }

    public void setVlan(String vlan) {
        this.vlan = vlan;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public void setDomainName(String domain) {
        this.domain = domain;
    }

    public void setNetworkOfferingAvailability(String networkOfferingAvailability) {
        this.networkOfferingAvailability = networkOfferingAvailability;
    }

    public void setServices(List<ServiceResponse> services) {
        this.services = services;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setNetworkDomain(String networkDomain) {
        this.networkDomain = networkDomain;
    }

    @Override
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setPhysicalNetworkId(String physicalNetworkId) {
        this.physicalNetworkId = physicalNetworkId;
    }

    public void setAclType(String aclType) {
        this.aclType = aclType;
    }

    public void setSubdomainAccess(Boolean subdomainAccess) {
        this.subdomainAccess = subdomainAccess;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public void setRestartRequired(Boolean restartRequired) {
        this.restartRequired = restartRequired;
    }

    public void setSpecifyIpRanges(Boolean specifyIpRanges) {
        this.specifyIpRanges = specifyIpRanges;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public void setCanUseForDeploy(Boolean canUseForDeploy) {
        this.canUseForDeploy = canUseForDeploy;
    }

    public void setTags(List<ResourceTagResponse> tags) {
        this.tags = tags;
    }
}

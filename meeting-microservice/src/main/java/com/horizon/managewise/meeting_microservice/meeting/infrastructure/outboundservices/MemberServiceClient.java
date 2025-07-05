package com.horizon.managewise.meeting_microservice.meeting.infrastructure.outboundservices;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import java.util.Arrays;
import java.util.List;

@Component
public class MemberServiceClient {
    private final RestTemplate restTemplate;
    private final String memberServiceBaseUrl;

    public MemberServiceClient(RestTemplate restTemplate,
                               @Value("${memberservice.url:http://localhost:8081}") String memberServiceBaseUrl) {
        this.restTemplate = restTemplate;
        this.memberServiceBaseUrl = memberServiceBaseUrl;
    }

    public List<Long> fetchAllMemberIds() {
        String url = memberServiceBaseUrl + "/api/members/ids";
        Long[] ids = restTemplate.getForObject(url, Long[].class);
        return Arrays.asList(ids != null ? ids : new Long[0]);
    }

    public Long fetchMemberIdByFullName(String fullName) {
        String url = memberServiceBaseUrl + "/api/members/id-by-fullname?fullName=" + fullName;
        Long id = restTemplate.getForObject(url, Long.class);
        return id != null ? id : 0L;
    }
}

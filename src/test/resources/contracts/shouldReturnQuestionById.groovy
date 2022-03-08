import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return question by id"
    request {
        method GET()
        url("/question/1")
    }
    response {
        status 200
        body("{\"id\":1,\"ratePoints\":null,\"text\":\"First question?\",\"authorId\":1," +
                "\"location\":1,\"isResponded\":true,\"createdDate\":[-999999999,1,1]}")
        headers {
            contentType applicationJson()
        }
    }
}
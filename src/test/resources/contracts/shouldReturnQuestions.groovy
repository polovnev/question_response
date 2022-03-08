import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return questions"
    request {
        method POST()
        url("/question/find")
        headers {
            contentType applicationJson()
        }
        body(
                "locationId": 1
        )
    }
    response {
        status 200
        body("[{\"id\":1,\"ratePoints\":null,\"text\":\"First question?\",\"authorId\":1,\"location\":1,\"isResponded\":true,\"createdDate\":[-999999999,1,1]}," +
                "{\"id\":2,\"ratePoints\":null,\"text\":\"Second question?\",\"authorId\":1,\"location\":1,\"isResponded\":false,\"createdDate\":[-999999999,1,1]}]")
        headers {
            contentType applicationJson()
        }
    }
}
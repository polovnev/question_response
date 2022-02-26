import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return responses by question id"
    request {
        method GET()
        url("/question/1/response")
    }
    response {
        status 200
        body("[{\"responseId\":1,\"text\":\"First response!\",\"author\":1,\"isResponse\":true},{\"responseId\":2,\"text\":\"Second response!\",\"author\":1,\"isResponse\":true}]")
        headers {
            contentType applicationJson()
        }
    }
}
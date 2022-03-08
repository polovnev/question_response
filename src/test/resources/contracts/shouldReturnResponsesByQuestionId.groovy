import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return responses by question id"
    request {
        method GET()
        url("/question/1/response")
    }
    response {
        status 200
        body("[{\"id\":1,\"text\":\"First response!\",\"authorId\":1,\"isResponse\":true},{\"id\":2,\"text\":\"Second response!\",\"authorId\":1,\"isResponse\":true}]")
        headers {
            contentType applicationJson()
        }
    }
}
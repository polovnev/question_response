import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return responses by question id"
    request {
        method GET()
        url("/tag")
    }
    response {
        status 200
        body("[{\"id\":1,\"text\":\"Documents\",\"color\":\"#FFF8DC\"},{\"id\":2,\"text\":\"Food\",\"color\":\"#7FFF00\"}]")
        headers {
            contentType applicationJson()
        }
    }
}
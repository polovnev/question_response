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
    }
}
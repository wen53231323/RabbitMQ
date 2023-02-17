import com.wen.rabbitmq.SpringbootApplication;
import com.wen.rabbitmq.config.RabbitMQConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringbootApplication.class)
public class RebbitMQTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void test() {
        // 发送信息，参数一交换机名称，参数二路由通配符匹配规则，参数三发送的消息
        rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_NAME,"boot.hello","hello");
    }
}

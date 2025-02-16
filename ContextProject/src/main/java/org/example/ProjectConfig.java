package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean // Inserting element into Context (Container)
    @Primary // Primary bean
    VideoCard geForce3060() {
        var videoCard = new VideoCard();
        videoCard.setName("NVidia GeForce RTX 3060 Ti");
        return videoCard;
    }

    @Bean
    VideoCard geForce4050() {
        var videoCard = new VideoCard();
        videoCard.setName("NVidia GeForce RTX 4050");
        return videoCard;
    }

    @Bean
    VideoCard Ryzen7() {
        var videoCard = new VideoCard();
        videoCard.setName("AMD Ryzen 7 7800X3D");
        return videoCard;
    }

    @Bean
    Laptop lenovo() {
        var laptop = new Laptop();
        laptop.setName("Lenovo ThinkPad");
        laptop.setVideoCard(Ryzen7()); // Setting video Ryzen 7
        return laptop;
    }

    @Bean
    Laptop gigabyte() {
        var laptop = new Laptop();
        laptop.setName("Gigabyte F5 MF5");
        laptop.setVideoCard(geForce4050()); // Setting video card GeForce 4050
        return laptop;
    }
    @Bean
    Laptop asus(@Autowired VideoCard videoCard) { // Getting primary bean
        var laptop = new Laptop();
        laptop.setName("Asus TUF");
        laptop.setVideoCard(videoCard); // Setting primary bean
        return laptop;
    }
}

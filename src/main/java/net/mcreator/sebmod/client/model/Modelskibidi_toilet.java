package net.mcreator.sebmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelskibidi_toilet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("seb_mod_", "modelskibidi_toilet"), "main");
	public final ModelPart bone;
	public final ModelPart bone2;

	public Modelskibidi_toilet(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 27).addBox(-5.0F, -2.0F, -4.0F, 10.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-6.0F, -3.0F, -5.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(46, 7)
						.addBox(-7.0F, -7.0F, -6.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(38, 48).addBox(-5.0F, -6.0F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(41, 0)
						.addBox(4.0F, -6.0F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 37).addBox(5.0F, -7.0F, -6.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 5.0F, 17.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.0F, 4.0F, 4.0F, 14.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(32, 17).addBox(4.0F, -7.0F, -5.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(14, 41).addBox(-4.0F, -7.0F, -5.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(30, 31).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
